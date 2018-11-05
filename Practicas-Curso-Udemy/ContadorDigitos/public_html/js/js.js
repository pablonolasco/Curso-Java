/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
let num=parseInt(prompt('Escribe un número',1));
digito();
function digito () {
    /*let longitud= num.toString().length;
    if(num >=0){
        document.write(longitud);
    }else{
        
        document.write(longitud);
    }*/
    let contador=0;
    while(num >=1){
        num=num/10;
        contador++;
    }
    
    document.write(`El número proporcionado contiene ${contador} digitos`);
}


