package com.tabithatallent.portfolio.views.projects

import androidx.compose.runtime.Composable
import com.tabithatallent.portfolio.components.FeaturesList
import com.tabithatallent.portfolio.components.TechChip
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Video

@Composable
fun taxCalculator() {
    Div(attrs = { classes("japcrd") }) {

        // ── HERO ──────────────────────────────────────────────────────
        Div(attrs = { classes("project-hero") }) {
            Div(attrs = { classes("project-hero-content") }) {
                H1(attrs = { classes("project-view-title") }) {
                    Text("Tax Calculator")
                }
                P(attrs = { classes("project-hero-subtitle") }) {
                    Text("Command-Line Sales Tax Tool — Python")
                }
                A(
                    href = "https://github.com/TabbyCat444/tax-calculator",
                    attrs = { classes("project-hero-link") }
                ) {
                    Text("View on GitHub")
                }
            }
        }

        // ── OVERVIEW ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Overview")
        }
        P {
            Text(
                "Tax Calculator is a lightweight, command-line tool for computing sales tax, " +
                        "originally built to help an electronics retail associate quickly answer the " +
                        "ever-present customer question: \"Can you tell me how much all this will cost " +
                        "after tax?\" The calculator is configured for Texarkana, TX, handling standard " +
                        "sales tax and the specific additional tax for mobile devices. It uses Python's " +
                        "Decimal module for exact cent-level accuracy and is designed as a simple template " +
                        "that can be adapted for any city or state."
            )
        }

        // ── METADATA ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Metadata")
        }
        P {
            Text("Role: Sole Developer & Designer")
            Br()
            Text("Category: Utility, Command-Line Tool, Educational")
            Br()
            Text("Repository: ")
            A(href = "https://github.com/TabbyCat444/tax-calculator", attrs = { classes("project-hero-link") })
            { Text("github.com/TabbyCat444/tax-calculator") }
        }

        // ── TECH STACK ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Tech Stack")
        }
        Div(attrs = { classes("tech-stack-grid") }) {
            TechChip("Language", "Python 3.13+")
            TechChip("Dependencies", "None (stdlib only)")
            TechChip("Precision Math", "decimal.Decimal with ROUND_HALF_UP")
            TechChip("Architecture", "Functional — input, calculation, output")
            TechChip("Type Hints", "Full annotation coverage")
            TechChip("Build Tool", "uv (Python package manager)")
            TechChip("Target Region", "Texarkana, TX")
            TechChip("License", "Open Source Template")
        }

        // ── KEY FEATURES ──────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Features")
        }
        FeaturesList(
            "Dual Tax Calculation — separates standard items from mobile devices, which carry a specific additional tax rate",
            "Precision Math — uses Python's Decimal module for exact cent-level accuracy, avoiding floating-point errors",
            "Simple CLI — no installation or heavy dependencies required; just run the script from the terminal",
            "Modular Structure — clean separation of input helpers, calculation logic, and output formatting",
            "Configurable Tax Rates — standard local tax and mobile device tax are defined as top-level constants for easy adaptation",
            "Robust Input Validation — handles invalid numeric input and non-y/n responses gracefully with retry prompts"
        )

        // ── THE CHALLENGE ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Challenge")
        }
        P {
            Text(
                "In a retail electronics environment, customers frequently ask for the total cost " +
                        "including tax before committing to a purchase. Mobile devices often carry a " +
                        "separate, additional tax surcharge on top of the standard local rate. The challenge " +
                        "was building a tool that could accurately separate these two tax categories, compute " +
                        "the correct totals, and present a clear breakdown — all without floating-point " +
                        "rounding errors that could lead to incorrect charges."
            )
        }
        P {
            Text("1. Exact Monetary Arithmetic — standard Python float arithmetic introduces rounding errors that are unacceptable for financial calculations. The solution required using the Decimal module with explicit rounding modes.")
        }
        P {
            Text("2. Dual Tax Category Handling — mobile devices and standard items are taxed at different rates. The calculator needed to collect prices for each category separately, apply the correct rate to each, and present a unified breakdown.")
        }
        P {
            Text("3. Template Design — the tool needed to be simple enough for anyone to adapt to their own city or state, with clearly marked constants and no hidden dependencies.")
        }

        // ── THE SOLUTION & ARCHITECTURE ───────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Solution & Architecture")
        }
        P {
            Text(
                "A three-function functional design with strict separation of concerns: " +
                        "input handling, tax computation, and result presentation."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Precision Math with Decimal")
        }
        P {
            Text(
                "All monetary values are represented as Decimal instances, constructed from string " +
                        "input to avoid float conversion entirely. Tax rates are also Decimal constants " +
                        "(e.g., Decimal(\"0.0825\")), and the final display uses Python f-string formatting " +
                        "with :.2f to ensure exactly two decimal places. This eliminates all floating-point " +
                        "rounding errors in tax computation."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Input Validation Loop")
        }
        P {
            Text(
                "Both getMobilePrices() and getRegularPrices() use while-True loops that validate " +
                        "user input before appending to the price list. Non-y/n responses trigger a polite " +
                        "error message and re-prompt. Invalid price strings are caught by a try/except block " +
                        "around Decimal() construction. Entering 0 signals the end of input for each category."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Pure Calculation Function")
        }
        P {
            Text(
                "computeTaxes() is a pure function: it takes two lists of Decimal prices and returns " +
                        "a dictionary with five keys — regularSubtotal, mobileSubtotal, mobileTax, localTax, " +
                        "totalTax, and grandTotal. It has no side effects (no I/O, no state mutation), making " +
                        "it trivial to unit-test or reuse in other contexts. The function applies the mobile " +
                        "device tax rate to mobile prices and the standard local tax rate to regular prices, " +
                        "then sums them for the final totals."
            )
        }

        H4(attrs = { classes("project-view-detail-title") }) {
            Text("Configuration Constants")
        }
        P {
            Text(
                "Tax rates are defined as module-level Decimal constants at the top of the file, " +
                        "making them immediately visible and easy to change. An update date constant " +
                        "is displayed at program start so users always know the rate version. This " +
                        "design makes the calculator a drop-in template for any jurisdiction."
            )
        }

        // ── PROJECT STRUCTURE ─────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Project Structure")
        }
        Div(attrs = { classes("code-block") }) {
            Text(
                """tax-calculator/
├── tax-calculator-main.py    # Single-file application
│   ├── getMobilePrices()     # Input: mobile device prices
│   ├── getRegularPrices()    # Input: non-mobile item prices
│   ├── computeTaxes()        # Calculation: tax breakdown
│   ├── displayResults()      # Output: formatted totals
│   └── main()                # Entry point: orchestration
├── pyproject.toml            # uv project config (Python >=3.13)
├── uv.lock                   # Dependency lockfile (empty — no deps)
└── README.md                 # Documentation, usage examples, customization guide"""
            )
        }

        // ── KEY TAKEAWAYS ─────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Takeaways & Lessons Learned")
        }
        FeaturesList(
            "Decimal over float — financial calculations demand Decimal with ROUND_HALF_UP; float arithmetic introduces hidden rounding errors that are unacceptable for monetary values",
            "Pure functions are testable — isolating computeTaxes() as a pure function with no side effects made it trivial to verify correctness and reuse",
            "Configuration over magic numbers — defining tax rates as named constants at the top of the file makes the code self-documenting and easily adaptable",
            "Input validation as a first-class concern — robust error handling in CLI tools prevents crashes and provides a smooth user experience even with bad input",
            "Single-file simplicity — keeping the entire application in one well-structured file made the project easy to share, run, and adapt without any setup"
        )

        // ── ROADMAP ───────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Roadmap")
        }
        FeaturesList(
            "Multi-jurisdiction support — allow users to select from a list of predefined tax areas or enter custom rates",
            "Receipt export — save the tax breakdown to a text file for record-keeping",
            "Historical rate lookup — integrate with a tax rate API for up-to-date rates across all jurisdictions",
            "Bulk mode — paste a list of prices at once instead of one at a time",
            "Tax-inclusive mode — calculate the pre-tax price when the total (including tax) is known",
            "GUI version — port to a simple Tkinter or PyQt interface for non-terminal users"
        )

        // ── DEMO VIDEO ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Demo Video")
        }

        Div(attrs = { classes("demo-video-row") }) {
            Video(
                attrs = {
                    attr("src", "videos/TaxCalculator-DemoVid.mp4")
                    attr("controls", "")
                    attr("playsinline", "")
                    classes("demo-video")
                }
            )
        }

        // ── DEMO ──────────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Demo")
        }
        Div(attrs = { classes("code-block") }) {
            Text(
                """Please note that this calculator is specific to Texarkana, TX and was last updated on 2026-08-27

Please enter any items involving mobile devices first.

Mobile item? (y/n) y
Enter price: 100.00
Mobile item? (y/n) n

Enter price of non-mobile item (enter 0 when finished): 50.00
Enter price of non-mobile item (enter 0 when finished): 0

Total after tax: $166.12
Total mobile tax: $2.00
Total local tax: $4.12
Total tax amount: $6.12"""
            )
        }

        // ── Footer ────────────────────────────────────────────────────
        Div(attrs = { classes("project-footer") }) {
            P { Text("Created by Tabitha Tallent") }
            P { Text("Open Source — Free to Use and Modify") }
        }
    }
}
