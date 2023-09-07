package app.revanced.patches.twitch.misc.integrations

import app.revanced.patcher.patch.annotation.Patch
import app.revanced.patches.shared.integrations.patch.AbstractIntegrationsPatch
import app.revanced.patches.twitch.misc.integrations.fingerprints.InitFingerprint

@Patch(
    name = "Integrations",
    requiresIntegrations = true
)
object IntegrationsPatch : AbstractIntegrationsPatch(
    "Lapp/revanced/twitch/utils/ReVancedUtils;",
    listOf(InitFingerprint)
)