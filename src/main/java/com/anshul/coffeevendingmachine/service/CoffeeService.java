package com.anshul.coffeevendingmachine.service;

import com.anshul.coffeevendingmachine.input.*;
import com.anshul.coffeevendingmachine.model.*;


public interface CoffeeService {

    CoffeeMachine processRequest(InputRequest inputRequest);
}
