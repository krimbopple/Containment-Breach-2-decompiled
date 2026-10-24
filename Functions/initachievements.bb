Function initachievements%()
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    Local local4$
    achievementsindex = TBFZ246642()
    achievementsimages = TBFZ246642()
    unlockedachievements = TBFZ246642()
    
    achievementsarray = eax_000D
    localachievementsarray = X22X8B6X80((lang\Field0 + "Data\achievements.jsonc"))
    local1 = TD4644B68Z(TX0Z2Z4F86D(achievementsarray, "achievements"))
    local2 = TD0DFDZ4XX(local1)
    For local0 = $00 To (local2 - $01) Step $01
        local3 = TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local0), "id"))
        local4 = TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local0), "image"))
        YFZ8BD2F6(achievementsindex, local3, local0)
        YFZ8BD2F6(achievementsimages, local3, scaleimageex(loadimage_strict(("GFX\Menu\Achievements\" + local4)), menuscale, menuscale, $01))
    Next
    YFZ8BD2F6(achievementsimages, "locked", scaleimageex(loadimage_strict("GFX\Menu\Achievements\AchvLocked.png"), menuscale, menuscale, $01))
    Return $00
End Function
