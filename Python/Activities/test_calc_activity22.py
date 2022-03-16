import pytest
import math

def test_addition():
    # Initialise two numbers
        num1 = 10
        num2 = 12

        # Add them
        sum = num1 + num2

        #Assertion
        assert sum == 22

def test_subtract():
    # Initialise two numbers
        num1 = 20
        num2 = 11

        # Subtract them
        diff = num1 - num2

        #Assertion
        assert diff == 9

@pytest.mark.activity
def test_multiplication():
    # Initialise two numbers
        num1 = 8
        num2 = 9

        # Multiply them
        prod = num1 * num2

        #Assertion
        assert prod == 72
        
@pytest.mark.activity
def test_division():
    # Initialise two numbers
        num1 = 16
        num2 = 4

        # divide two numbers
        quot = num1 / num2

        #Assertion
        assert quot == 4