
# Conversor de Monedas 

Este proyecto es un conversor de monedas que permite a los usuarios convertir entre diferentes divisas utilizando tasas de cambio actualizadas en tiempo real. Aprovechando una API para obtener los valores de las divisas, el conversor proporciona resultados precisos y confiables al instante. La aplicación es fácil de usar, con una consola intuitiva que facilita la selección de la moneda de origen y destino, así como la cantidad a convertir.

## Componentes

 - [JDK 22](https://www.oracle.com/java/technologies/javase/jdk22-archive-downloads.html)
 - [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0)
 - [EXCHANGERATE-API](https://www.exchangerate-api.com/)


## API Reference

#### Obtener todos los items

```http
GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/codes
```

| Parameter | Type     | Descripcion                |
| :-------- | :------- | :------------------------- |
| `api_key` | `string` | **Required**. Tu API key |

| Parameter | Type     | Descripcion                |
| :-------- | :------- | :------------------------- |
| `codes` | `string` | Todas las Divisas Soportadas |

#### Obtener item

```http
GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/currency
```

| Parameter | Type     | Descripcion                       |
| :-------- | :------- | :-------------------------------- |
| `currency`      | `string` | **Required**. Consultar Divisas |

#### Convertir Pares

```http
GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP
```

| Parameter | Type     | Descripcion                     |
| :-------- | :------- | :-------------------------------- |
| `pair`      | `string` | **Required**. Palabra de Par a Convertir |

| Parameter | Type     | Descripcion                       |
| :-------- | :------- | :-------------------------------- |
| `base currency`      | `string` | **Required**. Divisas de Venta |

| Parameter | Type     | Descripcion                       |
| :-------- | :------- | :-------------------------------- |
| `target currency`      | `string` | **Required**. Divisas de Compra|



## Documentation

- [JDK 22](https://docs.oracle.com/en/java/javase/22/)
- [GSON](https://github.com/google/gson)
- [EXCHANGERATE-API](https://www.exchangerate-api.com/docs/overview)

## Authors

- [@DevLuis](https://github.com/info-luisdev)


## License

- [MIT](https://choosealicense.com/licenses/mit/)

