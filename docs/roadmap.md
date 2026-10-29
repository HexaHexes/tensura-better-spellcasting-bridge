# Roadmap - tensura-better-spellcasting-bridge

Generated from and kept in sync with this repository's issues. The authoritative
status is always the issue list. The cross-repository requirements inventory
(REQ IDs) lives in `tensura-ability-core/docs/requirements.md` - this roadmap
references those IDs rather than duplicating their status.

## Phase 0 - Organisation and repository foundation

- [x] Repository created from `neoforge-mod-template` (bootstrap PR #1 merged)
- [x] Issue forms (feature / bug / investigation), labels, branch rulesets applied

## Phase 1 - Requirements and feasibility (spikes)

- [ ] #3 - Better Spellcasting internals/extensibility + Better Combat 2.4.0
  combo events (SPIKE-br-1). Preliminary read-only findings recorded in the
  issue; DEC-01 (licence contradiction) and DEC-04 (pin distributed version)
  close here.
- [ ] #2 - Resource payment semantics, payment modes, single-charge atomicity
  (SPIKE-br-2). Depends on ISS mana-deduction findings (SPIKE-iss-1, ISS repo #2)
  and Tensura cost findings (SPIKE-iss-2, ISS repo #3).

Each spike closes only with verified findings **and** its implementation issues
created (investigation form contract).

## Phase 4 - Combo integration

One implementation issue per requirement, created as spikes close:
REQ-BR-01/02 (extension + reuse of BC/BS machinery), REQ-BR-03 (on_attack/on_hit
timing), REQ-BR-04 (channelled-activation policy), REQ-BR-05 (eligibility
whitelist/blacklist), REQ-BR-06/07/08/09 (payment modes, single charge, failure
atomicity, one-payment-per-activation), REQ-BR-10 (weapon-specific combo failure
handling).

## Cross-repo contracts

- Eligibility and payment ride on `tensura-ability-core` (REQ-CORE-04/07).
- Payloads come from `tensura` (optional) and `tensura_battlewills` (optional);
  missing adapters stay unavailable even when whitelisted (REQ-BR-05).
- Battlewill combo integration location depends on DEC-03 (battlewills repo #4).

## Phase 6 - Compatibility and release readiness

- Payment double-charge regression tests (REQ-TEST-04 rows); dedicated-server
  combo-state validation; Better Spellcasting-version drift checks (DEC-04).
