from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
import time
# Configuracion Webdriver
driver = webdriver.Chrome()
driver.get("https://www.saucedemo.com/")
time.sleep(5)
#
driver.find_element(By.ID, "user-name").send_keys("standard_user")
driver.find_element(By.ID, "password").send_keys("secret_sauce")
driver.find_element(By.ID, "login-button").click()
url_actual = driver.current_url
if url_actual == "https://www.saucedemo.com/inventory.html":
    print("Inicio de sesion exitoso")
#Agregar un producto al carrito
driver.find_element(By.ID, "add-to-cart-sauce-labs-fleece-jacket").click()
driver.find_element(By.ID, "add-to-cart-sauce-labs-onesie").click()
driver.find_element(By.CLASS_NAME, "shopping_cart_link").click()

#Verificar que los productos esten en el carrito

elemento_carrito = driver.find_element(By.CLASS_NAME, "shopping_cart_badge").text
if elemento_carrito == "2":
    print("Los productos se agregaron al carrito correctamente")
input("Presiona enter para cerrar el navegador...")
driver.quit()
