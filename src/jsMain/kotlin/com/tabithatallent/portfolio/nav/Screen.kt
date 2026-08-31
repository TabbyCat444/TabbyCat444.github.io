package com.tabithatallent.portfolio.nav

import androidx.compose.runtime.Composable
import com.tabithatallent.portfolio.views.projects.cornerSliceBakery
import com.tabithatallent.portfolio.views.projects.druidSpaceProgram
import com.tabithatallent.portfolio.views.projects.japCard
import com.tabithatallent.portfolio.views.projects.kidnappedByTheFae
import com.tabithatallent.portfolio.views.projects.taxCalculator

sealed class ProjectScreen(val name: String) {
    data object JapCrd : ProjectScreen("Jap Card")
    data object CornerSliceBakery : ProjectScreen("The Corner Slice Bakery")
    data object KidnappedByTheFae : ProjectScreen("Kidnapped by the Fae")
    data object TaxCalculator : ProjectScreen("Tax Calculator")
    data object DruidSpaceProgram : ProjectScreen("Druid Space Program")

    object ProjectViewRegistry {
        @Composable
        fun render(screen: ProjectScreen) {
            when (screen) {
                is JapCrd -> japCard()
                is CornerSliceBakery -> cornerSliceBakery()
                is KidnappedByTheFae -> kidnappedByTheFae()
                is TaxCalculator -> taxCalculator()
                is DruidSpaceProgram -> druidSpaceProgram()
            }
        }
    }

    @Composable
    fun render() {
        ProjectViewRegistry.render(this)
    }
}
