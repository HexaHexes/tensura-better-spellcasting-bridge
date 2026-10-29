# Tensura - Better Spellcasting Bridge

Tensura - Better Spellcasting Bridge lets the Tensura RPG pack's abilities fire
off the end of a weapon combo. Better Combat supplies the timing, Better
Spellcasting the chain execution, and Tensura skills, magic and battlewills are
the payload.

## What it does

*(Design phase, no release yet. The open issues on this repository hold the
full plan, research tables and open design decisions.)*

- Chain a weapon combo into a Tensura skill, magic or battlewill, using Better
  Combat's own swing timing and hit detection.
- **Whitelists and blacklists** are independent per ability type. Passives are
  excluded by default, and blacklists always win.
- Native cost applies by default, with per-ability scaled, fixed, free or
  disabled modes. If the bridge cannot prove the cost was paid, the ability
  does not fire and no resource is consumed.
- A failed cast lets the ordinary weapon attack through. The bridge never
  double-charges and never consumes resources twice.

## Dependencies
| | Mod | Why |
|---|---|---|
| Required | Minecraft / NeoForge | 1.21.1 / 21.1.259 |
| Required | Better Combat | Combo timing, swing and hit events |
| Required | Better Spellcasting | Combo-chain execution model and existing ISS behaviour |
| Required | Tensura Ability Core | Activation, eligibility and payment contracts |
| Optional | Tensura: Reincarnated | Tensura skills and magic as combo payloads |
| Optional | Tensura Battlewills | Battlewills as combo payloads |

When the first alpha ships, drop the jar in `mods/` alongside its required
dependencies.

## Credits
- Built on [NeoForge](https://neoforged.net/).
- Builds on [Better Combat](https://www.curseforge.com/minecraft/mc-mods/better-combat)
  and [Better Spellcasting](https://www.curseforge.com/minecraft/mc-mods/better-spellcasting).

## License

GNU Lesser General Public License v2.1 - see [`LICENSE`](LICENSE).
Copyright (c) 2026 Bitwise Madness.

## AI disclosure

Parts of this project were written with the assistance of AI coding tools.
AI-assisted code, data and documentation ship only after human review by the
maintainers.