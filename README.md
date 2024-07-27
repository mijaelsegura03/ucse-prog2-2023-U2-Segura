<b>Cobertura tests:</b>
<br>
![image](https://github.com/mijaelsegura03/ucse-prog2-2023-U2-Segura/assets/130618172/e91fdf3d-3013-4d48-a63d-40160240722e)
<br>
<b>Resultado pruebas benchmark:</b>
<br>
![image](https://github.com/user-attachments/assets/8f0cbd48-ba95-44c4-b5d6-ba25266350f5)
<br>
En las pruebas benchmark lo que se está haciendo es comparar el rendimiento en la ejecución de la misma tarea de dos formas distintas, utilizando paralellStream y Stream.
<br>
Podemos observar que los resultados se miden en ms/ops que son las operaciones por milisegundo que realiza cada forma de ejecución de la tarea, para poder asignar un puntaje a cada una en base a dicha unidad, y así compararlas.
<br>
También se hace uso del objeto BlackHole, para evitar las optimizaciones del compilador JIT y así obtener unos resultados más precisos.
<br>
<br>
La conclusión a la que podemos llegar es que el paralelismo obtiene una cantidad de operaciones por segundo bastante mayor que la concurrencia, esto debido a que paralellStream nos permite
mejorar el rendimiento en la realización de una tarea a través del uso de múltiples Threads (hilos de ejecución), haciendo que dicha tarea se ejecute en <b>paralelo</b> sobre los distintos
hilos.



## Adicionales:
- Ejercicio 1: Podría haber chequeado en CalculadorCombustibleTest cuando instance == null.
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta build, "hs_err_pid5148.log" y otros.
