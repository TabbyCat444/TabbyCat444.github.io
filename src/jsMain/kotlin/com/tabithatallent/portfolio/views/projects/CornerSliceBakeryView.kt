package com.tabithatallent.portfolio.views.projects

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text

@Composable
fun cornerSliceBakery() {
    Div(attrs = { classes("japcrd") }) {

        // ── Hero ──────────────────────────────────────────────────────
        Div(attrs = { classes("project-hero") }) {
            H1(attrs = { classes("project-view-title") }) {
                Text("The Corner Slice Bakery")
            }
            P(attrs = { classes("project-hero-subtitle") }) {
                Text("Artisan Bakery Website & Interactive Menu" )
            }
            A(
                href = "https://github.com/tabbycat444/TheCornerSliceBakery",
                attrs = { classes("project-hero-link") }
            ) { Text("View on GitHub") }
        }

        // ── Overview ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Overview")
        }
        P {
            Text(
                "The Corner Slice Bakery is a modern, responsive website built with Webpack that showcases " +
                        "a full product catalog, catering options, and interactive UX features. Designed around a " +
                        "custom brand identity, it leverages modular HTML component architecture and dynamic asset " +
                        "bundling to deliver lightweight visual menu popups and a fast, seamless user experience."
            )
        }

        // ── Metadata ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Metadata")
        }
        P {
            Text("Role: Lead Developer & UI Designer")
            Br()
            Text("Category: E-Commerce, Restaurant Website, Interactive Application")
            Br()
            Text("Repository: ")
            A(href = "https://github.com/tabbycat444/TheCornerSliceBakery", attrs = { classes("project-hero-link")} )
            { Text("github.com/tabbycat444/TheCornerSliceBakery") }
        }

        // ── Tech Stack ────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Tech Stack")
        }
        Div(attrs = { classes("tech-stack-grid") }) {
            techChip("Language", "HTML5, CSS3, JavaScript")
            techChip("Build Tool", "Webpack 5")
            techChip("Architecture", "Component Injection Pipeline")
            techChip("Layout", "CSS Flexbox & Grid")
            techChip("Typography", "Cormorant Garamond + Inter")
            techChip("Fonts", "Google Fonts API")
            techChip("Asset Pipeline", "CopyWebpackPlugin + html-loader")
            techChip("Development", "Webpack Dev Server + HMR")
        }

        // ── Features ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Features")
        }
        featuresList(
            "Responsive multi-page layout — Home, Menu, Contact & Catering, 404, and Attributions pages",
            "Interactive image popups — click any menu item to open a lightweight modal with full-size photo",
            "Modular HTML components — header, footer, meta tags, and modal shared across all pages",
            "Single event handler — one JS handler dynamically populates the modal using data-* attributes",
            "Custom brand identity — warm terracotta palette, rustic serif headings, clean sans-serif body text",
            "Catering tier system — five curated platter options with serving sizes and pricing",
            "Hot module replacement — instant preview during development with Webpack Dev Server",
            "Production-ready builds — minified and optimized assets output to dist/"
        )

        // ── Pages ─────────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Pages")
        }
        Div(attrs = { classes("decks-list") }) {
            deckItem("Home", "Hero, About, Featured Products")
            deckItem("Menu", "Full product catalog with 20+ items and image popups")
            deckItem("Contact & Catering", "Contact info, five catering tiers, add-ons")
            deckItem("404", "Custom error page")
            deckItem("Attributions", "Image credits and licensing")
        }

        // ── Challenge ─────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Challenge")
        }
        P {
            Text(
                "A local bakery needed a professional online presence that could showcase their artisan " +
                        "products, provide clear catering options, and feel as warm and inviting as their shop — " +
                        "without the overhead of a heavy framework or CMS."
            )
        }
        P {
            Text("1. Visual Appeal — the site needed to reflect the rustic, handcrafted nature of the bakery's products.")
        }
        P {
            Text("2. Performance — lightweight, fast-loading pages without bloated JavaScript dependencies.")
        }
        P {
            Text("3. Maintainability — easy to update menus, add products, and manage shared layout components.")
        }

        // ── Solution ──────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("The Solution & Architecture")
        }
        P {
            Text(
                "A modular, Webpack-powered static site with component injection, dynamic asset bundling, " +
                        "and a single-page interactive modal system."
            )
        }

        H4 { Text("Component Injection Architecture") }
        P {
            Text(
                "Global layout sections — header.html, footer.html, meta.html, and menu-image-popup.html — " +
                        "are imported into each page using Webpack's html-loader preprocessing. This ensures " +
                        "single-source template maintenance: update the header once and every page reflects the change."
            )
        }

        H4 { Text("Interactive Image Popups") }
        P {
            Text(
                "Menu items use HTML data-* attributes (data-img, data-title, data-price) to store " +
                        "metadata. A single lightweight event handler in app.js dynamically populates and opens " +
                        "the reusable modal component — no duplicate DOM markup, no per-item event bindings."
            )
        }

        H4 { Text("Asset Pipeline") }
        P {
            Text(
                "Webpack handles CSS bundling (css-loader + style-loader), JavaScript entry points, and " +
                        "static asset copying (CopyPlugin). Images, fonts, and favicons are processed as resources " +
                        "with hashed filenames for cache-busting in production."
            )
        }

        // ── Project Structure ─────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Project Structure")
        }
        Div(attrs = { classes("code-block") }) {
            Text(
                """TheCornerSliceBakery/
├── src/
│   ├── assets/
│   │   ├── icons/                  # Favicons and web app icons
│   │   └── img/                    # Bakery product, background, and logo assets
│   ├── components/                 # Reusable HTML partials
│   │   ├── header.html             # Global navigation and logo
│   │   ├── footer.html             # Footer with links and copyright
│   │   ├── menu-image-popup.html   # Reusable modal markup
│   │   └── meta.html               # Shared <head> meta tags
│   ├── css/
│   │   └── style.css               # Global styles (CSS variables, reset, layout)
│   ├── js/
│   │   ├── vendor/                 # Third-party libraries (lodash)
│   │   └── app.js                  # Main bundle entry & modal logic
│   ├── 404.html                    # Custom error page
│   ├── attributions.html           # Image credits and licensing
│   ├── contact-catering.html       # Catering tiers & contact layout
│   ├── index.html                  # Landing page
│   └── menu.html                   # Full product menu layout
├── webpack.common.js               # Shared Webpack configuration
├── webpack.config.dev.js           # Development server (HMR)
├── webpack.config.prod.js          # Production build (minification)
└── package.json"""
            )
        }

        // ── Menu Highlights ───────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Menu Highlights")
        }
        Div(attrs = { classes("decks-list") }) {
            deckItem("Artisanal Breads", "Sourdough, Focaccia, Baguette, Brioche")
            deckItem("Savory Slices", "Puff pastry, tarts, sausage rolls, galette")
            deckItem("Pastries & Scones", "Morning buns, danish, croissants, scones")
            deckItem("Cookies & Sweets", "Cookies, brownies, snickerdoodles")
            deckItem("Drinks & Extras", "Coffee, whipped butter, spread jars")
            deckItem("Catering Tiers", "5 platter options from $32–$120")
        }

        // ── Takeaways ─────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Key Takeaways")
        }
        featuresList(
            "Component-driven development — HTML partials with Webpack preprocessing keeps the codebase DRY",
            "Performance-first approach — no framework overhead; the entire site loads fast with minimal JS",
            "Data attribute pattern — using data-* for modal population is elegant, scalable, and avoids inline handlers",
            "CSS custom properties — single source of truth for the brand palette makes theming consistent"
        )

        // ── Roadmap ───────────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Completed ✓")
        }
        featuresList(
            "Responsive multi-page layout across all breakpoints",
            "Interactive image popup modal system",
            "Modular component architecture",
            "Production-ready Webpack build pipeline",
            "Custom brand identity with warm, rustic aesthetic",
            "Catering tier system with full pricing"
        )

        // ── Screenshots ───────────────────────────────────────────────
        H3(attrs = { classes("project-view-subtitle") }) {
            Text("Screenshots")
        }
        Div(attrs = { classes("project-image-set") }) {
            Img(src = "images/CornerSliceBakery-Home.png", alt = "The Corner Slice Bakery — Home Page")
            Img(src = "images/CornerSliceBakery-Menu.png", alt = "The Corner Slice Bakery — Menu Page")
            Img(src = "images/CornerSliceBakery-ContactCatering.png", alt = "The Corner Slice Bakery — Catering Page")
        }

        // ── Footer ────────────────────────────────────────────────────
        Div(attrs = { classes("project-footer") }) {
            P { Text("Created by Tabitha Tallent") }
            P { Text("MIT License") }
        }
    }
}

// ── Helpers ────────────────────────────────────────────────────────────

@Composable
private fun techChip(label: String, value: String) {
    Div(attrs = { classes("tech-chip") }) {
        Span(attrs = { classes("tech-chip-label") }) {
            Text(label)
        }
        Div(attrs = { classes("tech-chip-value") }) {
            Text(value)
        }
    }
}


@Composable
private fun featuresList(vararg items: String) {
    items.forEach { item ->
        P {
            Span(attrs = { classes("feature-bullet") }) { Text("• ") }
            Text(item)
        }
    }
}

@Composable
private fun deckItem(name: String, count: String) {
    Div(attrs = { classes("deck-item") }) {
        Span(attrs = { classes("deck-number") }) { Text(count) }
        Span(attrs = { classes("deck-name") }) { Text(name) }
    }
}