

import com.sga.orm.dao.*;
import com.sga.orm.factory.*;
import com.sga.orm.dto.*;
import com.sga.orm.exceptions.*;
import com.sga.orm.jdbc.AbstractDAO;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PersonaDaoImpl extends AbstractDAO implements PersonaDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT id_persona, nombre, apellido FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( id_persona, nombre, apellido ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET id_persona = ?, nombre = ?, apellido = ? WHERE id_persona = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE id_persona = ?";

	/** 
	 * Index of column id_persona
	 */
	protected static final int COLUMN_ID_PERSONA = 1;

	/** 
	 * Index of column nombre
	 */
	protected static final int COLUMN_NOMBRE = 2;

	/** 
	 * Index of column apellido
	 */
	protected static final int COLUMN_APELLIDO = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column id_persona
	 */
	protected static final int PK_COLUMN_ID_PERSONA = 1;

	/** 
	 * Inserts a new row in the persona table.
	 */
	public PersonaPk insert(Persona dto) throws PersonaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT, Statement.RETURN_GENERATED_KEYS );
			int index = 1;
			stmt.setInt( index++, dto.getIdPersona() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getApellido() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		
			// retrieve values from auto-increment columns
			rs = stmt.getGeneratedKeys();
			if (rs != null && rs.next()) {
				dto.setIdPersona( rs.getInt( 1 ) );
			}
		
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PersonaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the persona table.
	 */
	public void update(PersonaPk pk, Persona dto) throws PersonaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getIdPersona() );
			stmt.setString( index++, dto.getNombre() );
			stmt.setString( index++, dto.getApellido() );
			stmt.setInt( 4, pk.getIdPersona() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PersonaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the persona table.
	 */
	public void delete(PersonaPk pk) throws PersonaDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getIdPersona() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PersonaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the persona table that matches the specified primary-key value.
	 */
	public Persona findByPrimaryKey(PersonaPk pk) throws PersonaDaoException
	{
		return findByPrimaryKey( pk.getIdPersona() );
	}

	/** 
	 * Returns all rows from the persona table that match the criteria 'id_persona = :idPersona'.
	 */
	public Persona findByPrimaryKey(int idPersona) throws PersonaDaoException
	{
		Persona ret[] = findByDynamicSelect( SQL_SELECT + " WHERE id_persona = ?", new Object[] {  new Integer(idPersona) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the persona table that match the criteria ''.
	 */
	public Persona[] findAll() throws PersonaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY id_persona", null );
	}

	/** 
	 * Returns all rows from the persona table that match the criteria 'id_persona = :idPersona'.
	 */
	public Persona[] findWhereIdPersonaEquals(int idPersona) throws PersonaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE id_persona = ? ORDER BY id_persona", new Object[] {  new Integer(idPersona) } );
	}

	/** 
	 * Returns all rows from the persona table that match the criteria 'nombre = :nombre'.
	 */
	public Persona[] findWhereNombreEquals(String nombre) throws PersonaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE nombre = ? ORDER BY nombre", new Object[] { nombre } );
	}

	/** 
	 * Returns all rows from the persona table that match the criteria 'apellido = :apellido'.
	 */
	public Persona[] findWhereApellidoEquals(String apellido) throws PersonaDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE apellido = ? ORDER BY apellido", new Object[] { apellido } );
	}

	/**
	 * Method 'PersonaDaoImpl'
	 * 
	 */
	public PersonaDaoImpl()
	{
	}

	/**
	 * Method 'PersonaDaoImpl'
	 * 
	 * @param userConn
	 */
	public PersonaDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "sga.persona";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Persona fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Persona dto = new Persona();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Persona[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Persona dto = new Persona();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Persona ret[] = new Persona[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Persona dto, ResultSet rs) throws SQLException
	{
		dto.setIdPersona( rs.getInt( COLUMN_ID_PERSONA ) );
		dto.setNombre( rs.getString( COLUMN_NOMBRE ) );
		dto.setApellido( rs.getString( COLUMN_APELLIDO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Persona dto)
	{
	}

	/** 
	 * Returns all rows from the persona table that match the specified arbitrary SQL statement
	 */
	public Persona[] findByDynamicSelect(String sql, Object[] sqlParams) throws PersonaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PersonaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the persona table that match the specified arbitrary SQL statement
	 */
	public Persona[] findByDynamicWhere(String sql, Object[] sqlParams) throws PersonaDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new PersonaDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
