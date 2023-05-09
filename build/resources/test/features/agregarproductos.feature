#Author: Yeison Ferney Osorio Buitrago

@Prueba
Feature: Agregar productos
  yo como usuario de la pagina Your Store
  quiero poder agregar productos al carrito
  para poder comprar productos los productos de la página

  Background:
    Given  que el usuario ingresa a la pagina yourstore


  @AgregarUnProducto
  Scenario: Agregar un producto al carrito
    Given el usuario esta en la seccion laptops de la pagina
    When agregar una laptop al carrito
    Then  el usuario debe ver el valor del producto "$602.00"


  @AgregarDosProducto
  Scenario: Agregar dos producto al carrito
    Given el usuario esta en la seccion laptops de la pagina yourstore
    When agregar dos laptop al carrito de compras
    Then  el usuario debe ver el valor de los dos producto "$3,202.00"


  @AgregarProductosVariados
  Scenario: Agregar varios producto al carrito
    Given el usuario esta en la pagina yourstore
    When el usuario agregar varios productos al carrito de compras
    Then  el usuario debe ver el valor de todos los producto "$943.98"

