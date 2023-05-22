Feature: Realizar compras de articulos
  Como un nuevo cliente
  Quiero ingresar a la pagina www.abc.com
  Para realizar una compra de un articulo

  @ejemplo
  Scenario Outline: Agregar articulo al carrito de compras
    Given que un nuevo cliente accede hasta la web de compras
    When el agrega la cantidad <cantidad> del producto <producto> al carro
    Then el ve los productos listados en el carro de compras
    Examples:
      | cantidad | producto  |
      | 3        | iPhone 13 |