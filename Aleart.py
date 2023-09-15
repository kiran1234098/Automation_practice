# Click the link to active the alert 
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.alert import Alert
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

wbsite= "https:"
path ='chromedriver'

driver = webdriver.Chrome(path)
driver.maximize_window()
driver.get(wbsite)
wait = WebDriverWait(driver=driver, timeout=10)
driver.find_element(By.LINK_TEXT,"See an example alert").click()

alert = wait.until(EC.alert_is_present())

text = alert.text

alert.accept()

driver.find_elementk(By.LINK_TEXT,"See a sample confirm").click()

wait.until(EC.alert_is_present())

alert=driver.switch_to.alert

text =alert.test
alert.dismiss()

driver.find_element(By.LINK_TEXT,'see a sample prompt').click()

wait.until(EC.alert_is_present())

alert = Alert(driver)

alert.send_keys("Selenium")

alert.accept()