EJERCICIO PROGRAMACION BASICA
Se requiere realizar una interfaz gráfica para mostrar las consultas que se solicitaran en el siguiente contexto.
Usted ha sido contratado por una empresa de construcciones para ser el administrador de las bases de datos dentro de esta además del desarrollador
de su sistema de gestión interna. Como prueba de entrada a la empresa se le ha solicitado que administre la base de datos y que codifique algunas 
consultas para extraer información que requiere la parte administrativa de la empresa, la información de estas consultas debe salir por la consola, 
por lo cual le han solicitado que cree una aplicación de consola que realice estas consultas a la base de datos y como resultado las entregue por consola. 

El proyecto debe seguir el patrón de diseño MVC (Modelo Vista Controlador), la estructura del proyecto es la siguiente:

la base de datos. La ubicación de la base de datos debe tener el valor de: "ProyectosConstruccion.db" cuando se entregue el reto.
Mientras que si se encuentra en su computador personal para realizar pruebas debe tener la ruta absoluta para acceder a la base de datos con el motor SQLite 3.

La plantilla del proyecto (Contiene todas las clases, pero sin las implementaciones de los métodos que debe contener, ni las propiedades de las clases) 
se puede descargar del siguiente link:
https://drive.google.com/file/d/1a-sgEd-0SzewUs-Hfl_rpgo76FkM0tTO/view?usp=sharing
Debe realizar la implementación de las tres primeras consultas que se propusieron en el reto 3.
1) Seleccione el id del proyecto, la fecha de inicio, la entidad bancaria y el serial de los proyectos que tengan como id de proyecto los números entre 4 y 12 
SIN INCLUIR LOS EXTREMOS.
2) Seleccione el nombre, salario, el deducible de pago de las ganancias del cliente en una columna que se llame “deducible” y los dos apellidos concatenados
y separados por un guion “-“ en otra columna de nombre “apellidos”. Solo seleccione los registros que tengan una ganancia entre 500000 y 650000 incluyendo 
los extremos.
𝒆𝒍 𝒅𝒆𝒅𝒖𝒄𝒊𝒃𝒍𝒆 𝒅𝒆𝒍 𝒔𝒂𝒍𝒂𝒓𝒊𝒐 𝒆𝒔 𝒆𝒍 𝟖% 𝒅𝒆 𝒍𝒂𝒔 𝒈𝒂𝒏𝒂𝒏𝒄𝒊𝒂𝒔
3) Seleccione el id del proyecto y como segunda y última columna el nombre del cliente concatenado con su primer apellido separados por un espacio 
con el nombre de la columna como nom_ape, y la condición deberá ser que todos los proyectos seleccionados pertenezcan a la entidad bancaria “Colpatria”.
Se deben implementar todas las consultas mencionadas anteriormente, dentro de una interfaz, deben de mostrarse en componentes JTable dentro de un JFrame. 
Queda a total libertad del estudiante el cómo se debe de ver la interfaz, incluso como funciona, ya que lo que se solicita en el presente requerimiento 
es que dentro de la interfaz se puedan visualizar las tres consultas arriba descritas, bien en tres JTable’s diferentes, o en un solo componente 
mediante la interacción con un JButton, es totalmente libre como esta interfaz va a funcionar, pero es obligatorio el mostrar las tres consultas.
Se recomienda seguir la estructura del proyecto, y en la clase App inicializar la Vista y en la vista crear la interfaz y su lógica.
Se deben de entregar, el código fuente de su proyecto implementando el manejo de la interfaz y UN VIDEO explicativo donde se debe mostrar 
(en menos de 3 minutos) el correcto funcionamiento de la interfaz gráfica. El código fuente debe proporcionarse en un repositorio PUBLICO de GitHub, 
así que, si el estudiante no tiene una cuenta en dicha aplicación, debe crearla (Es totalmente gratuito).
