<b>Cobertura tests:</b>
<br>
![image](https://github.com/mijaelsegura03/ucse-prog2-2023-U2-Segura/assets/130618172/e91fdf3d-3013-4d48-a63d-40160240722e)
<br>
<b>Resultado pruebas benchmark:</b>
<br>
![image](https://github.com/mijaelsegura03/ucse-prog2-2023-U2-Segura/assets/130618172/261caa56-39ba-4f1b-b6f3-d01abc81aa2d)
<br>
En las pruebas benchmark lo que se está haciendo es comparar el rendimiento en la ejecución de la misma tarea de dos formas distintas, utilizando paralellStream y Stream.
<br>
Podemos observar que los resultados se miden en ops/s que son las operaciones por segundo que realiza cada forma de ejecución de la tarea, para poder asignar un puntaje a cada una en base a dicha unidad, y así compararlas.
<br>
<br>
La conclusión a la que podemos llegar es que el paralelismo obtiene una cantidad de operaciones por segundo bastante mayor que la concurrencia, esto debido a que paralellStream nos permite
mejorar el rendimiento en la realización de una tarea a través del uso de múltiples Threads (hilos de ejecución), haciendo que dicha tarea se ejecute en <b>paralelo</b> sobre los distintos
hilos.
