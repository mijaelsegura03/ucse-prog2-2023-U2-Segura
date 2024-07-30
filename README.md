<b>Cobertura tests:</b>
<br>
![image](https://github.com/mijaelsegura03/ucse-prog2-2023-U2-Segura/assets/130618172/e91fdf3d-3013-4d48-a63d-40160240722e)
<br>
<b>Resultado pruebas benchmark:</b>
<br>
![image](https://github.com/mijaelsegura03/ucse-prog2-2023-U2-Segura/assets/130618172/261caa56-39ba-4f1b-b6f3-d01abc81aa2d)
<br>
En las pruebas benchmark lo que se está haciendo es comparar el rendimiento en la ejecución de la misma tarea de dos
formas distintas, utilizando paralellStream y Stream.
<br>
Podemos observar que los resultados se miden en ops/s que son las operaciones por segundo que realiza cada forma de
ejecución de la tarea, para poder asignar un puntaje a cada una en base a dicha unidad, y así compararlas.
<br>
<br>
La conclusión a la que podemos llegar es que el paralelismo obtiene una cantidad de operaciones por segundo bastante
mayor que la concurrencia, esto debido a que paralellStream nos permite
mejorar el rendimiento en la realización de una tarea a través del uso de múltiples Threads (hilos de ejecución),
haciendo que dicha tarea se ejecute en <b>paralelo</b> sobre los distintos
hilos.

# Correcciones - Estado:

## Necesarias para aprobar:

- Ejercicio 2: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. Podrían utilizar el modo de
  Benchmarking AverageTime y compararlo con Throughput, utilizar milisegundos, y NO utilizar optimizaciones del
  compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les permite tener
  resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo
  acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination

## Adicionales:

- Ejercicio 1: Podría haber chequeado en CalculadorCombustibleTest cuando instance == null.
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar, ni los archivos propios del
  framework que utilicen (.idea, .vscode, etc). De lo contrario se pueden pushear archivos indeseados, como la carpeta
  build, "hs_err_pid5148.log" y otros.
- La estructura de las carpetas podría separarse entre cada ejercicio de una manera más granular. Pordían separar entre
  ClasesATestear, Ejercicio3, Ejercicio4, Ejercicio2/PruebaBenchmark y colocar cada archivo en cada package correspondiente.
- En ésta misma linea, si hacen el refactor sugerido en el punto anterior, los tests siempre deberían de ir en el mismo
  package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir
  dentro de test/java/org/example/TestClasesATestear