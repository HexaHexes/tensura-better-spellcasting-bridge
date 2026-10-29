# Repo rules - tensura-better-spellcasting-bridge

Repo-specific rules and notes. The org-wide `AGENTS.md` beside this file is
maintained in [`neoforge-mod-template`](https://github.com/HexaHexes/neoforge-mod-template)
and pulled in verbatim - **never hand-edit it.** Everything in this file is this
repo's own and is edited freely; keep it aligned with the org rules rather than
restating them.

**Repo:** `HexaHexes/tensura-better-spellcasting-bridge` - **Mod ID:** `tensura_better_spellcasting_bridge` - **Branch:** `main`
**Platform:** Minecraft 1.21.1 / NeoForge 21.1.259 / JDK 21 - **Jar:** `build/libs/tensura_better_spellcasting_bridge-<version>.jar`

Extends Better Spellcasting's combo-chain integration to Tensura abilities and
battlewills: combo timing and hit detection reused from Better Combat, trigger
timing (on_attack/on_hit), configurable whitelist/blacklist eligibility per
ability type, per-ability resource payment modes (native/scaled/free/fixed/
disabled) with strict single-charge guarantees, and safe failure handling.

**Dependencies**
- Required: Minecraft, NeoForge, `bettercombat`, `better_spellcasting`,
  `tensura-ability-core` (from GitHub Packages via `PACKAGE_READ_TOKEN`, scoped
  to the Gradle step only).
- Optional: `tensura`, `tensura_battlewills` - payloads absent when the provider
  is absent; missing adapters stay unavailable even when whitelisted.

**Test:** `./gradlew runGameTestServer` - `TensuraBetterSpellcastingBridgeGameTests` (1 test). `expectedTests = 1`
in `build.gradle` must match the `@GameTest` count.

**Gotchas**
- **Better Spellcasting is All Rights Reserved on its 1.21 branch** (no LICENSE
  file; its gradle.properties says All Rights Reserved while its mods.toml says
  LGPL - contradictory and unverified). Interoperate through events and public
  fields only; never copy its code. Treat mixins into it as a last resort needing
  explicit approval.
- Better Spellcasting itself reflects into Better Combat's private
  `WeaponRegistry.registrations` - our integration must not depend on that
  reflection staying put.
- Double-charge prevention is a correctness requirement: verify where ISS deducts
  mana on the native path before wiring any payment mode.
- Client-only classes must stay off the dedicated server - combo state here is
  server-authoritative.