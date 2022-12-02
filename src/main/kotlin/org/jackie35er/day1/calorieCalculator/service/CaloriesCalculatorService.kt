package org.jackie35er.day1.calorieCalculator.service

import org.jackie35er.common.wrapper.domain.IntWrapper
import org.jackie35er.day1.calorieCalculator.domain.CalorieList
import org.jackie35er.day1.calorieCalculator.strategy.HandleCalorieListStrategy

interface CaloriesCalculatorService {

    fun calculateTotalCalories(calories: CalorieList, handleCalorieListStrategy: HandleCalorieListStrategy): IntWrapper

}