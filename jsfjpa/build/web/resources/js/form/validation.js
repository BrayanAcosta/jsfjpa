function confirmar(data){
    if(data.status === 'begin'){
        if(!confirm("Desea confirmar la accion?")){
            data.source.disabled = true;
        }
    }
}