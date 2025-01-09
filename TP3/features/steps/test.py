from behave import given, when, then
from calculatrice import Calculatrice  # Import de la classe Calculatrice

@given("I have a calculator")
def step_given_calculator(context):
    context.calculator = Calculatrice()  # Initialisation de la calculatrice

@given("I have numbers {num1:d} and {num2:d}")
def step_given_numbers(context, num1, num2):
    context.num1 = num1
    context.num2 = num2

@when("I add them")
def step_when_add(context):
    # Utilisation de la méthode addition de la calculatrice
    context.result = context.calculator.addition(context.num1, context.num2)

@then("the result should be {expected:d}")
def step_then_result(context, expected):
    # Vérification avec le résultat de la calculatrice
    assert context.result == expected, f"Expected {expected}, but got {context.result}"