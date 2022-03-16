import pytest

#write test method
def test_sum(num_list):

    #initialise sum
    sum = 0

    #Add numner in the list
    for n in num_list:
        sum += n

    #Assertion
    assert sum == 55

