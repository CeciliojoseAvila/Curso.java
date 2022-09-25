// Call the dataTables jQuery plugin
$(document).ready(function() {

    //alert(1225544455255);(esto era una prueba. este js html se encontraba dentro de demo, y se llamaba database.
    //Se cambia para hacerlo mas facil y sincronizar todo)//

    cargarUsuarios();

  $('#usuarios').DataTable();
});

async function cargarUsuarios(){

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();

    let listadoHTML = '';

  for (let usuario of usuarios){
let usuarioHTML = '<tr><td>'+ usuario.id +' </td> <td>'+ usuario.nombre +' '+ usuario.apellido +'</td> <td>'
                + usuario.email +'</td> <td>'+ usuario.teléfono +'</td> <td><a href="#" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a></td>';

 listadoHTML += usuarioHTML;
  }

  document.querySelector('#usuarios tbody').outerHTML =  listadoHTML;

}
