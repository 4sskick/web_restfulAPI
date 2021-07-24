# API SPEC

## Create Product

Request:
- Method: POST
- Endpoint: `/api/product`
- Header: 
  - Content-Type: application/json 
  - Accept: application/json
- Body:

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer"
}
```

Response:

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer",
  "createdAt": "date",
  "updatedAt": "date"
}
```

## Get Product

Request:
- Method: GET
- Endpoint: `/api/product/{id_product}`
- Header:
    - Accept: application/json

Response:

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer",
  "createdAt": "date",
  "updatedAt": "date"
}
```

## Update Product

Request:
- Method: PUT
- Endpoint: `/api/product{id_product}`
- Header:
    - Content-Type: application/json
    - Accept: application/json
- Body:

```json
{
  "name": "string",
  "price": "long",
  "quantity": "integer"
}
```

Response:

```json
{
  "id": "string, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer",
  "createdAt": "date",
  "updatedAt": "date"
}
```

## List product



## Delete Product

Request:
- Method: DELETE
- Endpoint: `/api/product{id_product}`
- Header:
    - Accept: application/json

Response:

```json

```