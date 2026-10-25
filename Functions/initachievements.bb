Function initachievements%()
    Local local0%
    Local local1%
    Local local2%
    Local local3$
    Local local4$
    achievementsindex = _CreateS2IMap()
    achievementsimages = _CreateS2IMap()
    unlockedachievements = _CreateS2IMap()
    
    achievementsarray = eax_000D
    localachievementsarray = _JsonParseFromFile((lang\Field0 + "Data\achievements.jsonc"))
    local1 = _JsonGetArray(_JsonGetValue(achievementsarray, "achievements"))
    local2 = _JsonGetArraySize(local1)
    For local0 = $00 To (local2 - $01) Step $01
        local3 = _JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local0), "id"))
        local4 = _JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local0), "image"))
        _S2IMapSet(achievementsindex, local3, local0)
        _S2IMapSet(achievementsimages, local3, scaleimageex(loadimage_strict(("GFX\Menu\Achievements\" + local4)), menuscale, menuscale, $01))
    Next
    _S2IMapSet(achievementsimages, "locked", scaleimageex(loadimage_strict("GFX\Menu\Achievements\AchvLocked.png"), menuscale, menuscale, $01))
    Return $00
End Function
