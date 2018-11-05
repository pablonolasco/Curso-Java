/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
document.write("Programa para determinar numero impar");
let num=parseInt( prompt("Escribe un numero:",1));
par();
function par(){
    if(num >= 0){
        if(num % 2 === 0)
            document.write("<br/>Número par");
        else
            document.write("<br/>Número impar");
    }else{
        document.write(`<br/>Proporciona un valor entero mayor a 0, número proproporcionado ${num}`);
    }
}


