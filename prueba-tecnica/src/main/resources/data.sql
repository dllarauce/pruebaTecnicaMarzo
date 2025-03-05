-- Clientes
INSERT INTO cliente (cliente_id, nombre, direccion, telefono, contraseña, estado) 
VALUES 
(1, 'Jose Lema', 'Otavalo sn y principal', '098254785', '1234', true),
(2, 'Marianela Montalvo', 'Amazonas y NNUU', '097548965', '5678', true),
(3, 'Juan Osorio', '13 junio y Equinoccial', '098874587', '1245', true);

-- Cuentas
INSERT INTO cuenta (id, numero_cuenta, tipo_cuenta, saldo_inicial, estado, cliente_id) 
VALUES 
(1, '478758', 'Ahorro', 2000, true, 1),
(2, '225487', 'Corriente', 100, true, 2),
(3, '495878', 'Ahorros', 0, true, 3),
(4, '496825', 'Ahorros', 540, true, 2),
(5, '585545', 'Corriente', 1000, true, 1);

-- Movimientos 
INSERT INTO movimiento (id, fecha, valor, saldo, cuenta_id) 
VALUES 
(1, '2022-02-10', 600, 700, 2),  -- Depósito de 600 en cuenta 225487
(2, '2022-02-08', -540, 0, 4);   -- Retiro de 540 en cuenta 496825