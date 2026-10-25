Function removetextureinstances%()
    Local local0%
    Local local1%
    Local local2%
    local1 = _JsonGetArray(_JsonGetValue(achievementsarray, "achievements"))
    local2 = _JsonGetArraySize(local1)
    For local0 = $00 To (local2 - $01) Step $01
        freeimage(_S2IMapGet(achievementsimages, _JsonGetString(_JsonGetValue(_JsonGetArrayValue(local1, local0), "id"))))
    Next
    freeimage(_S2IMapGet(achievementsimages, "locked"))
    _DestroyS2IMap(achievementsindex)
    achievementsindex = $00
    _DestroyS2IMap(achievementsimages)
    achievementsimages = $00
    _DestroyS2IMap(unlockedachievements)
    unlockedachievements = $00
    If (achievementsarray <> $00) Then
        _JsonFreeDocument(achievementsarray)
    EndIf
    If (localachievementsarray <> $00) Then
        _JsonFreeDocument(localachievementsarray)
    EndIf
    achievementsarray = $00
    localachievementsarray = $00
    For local0 = $00 To $12 Step $01
        freeimage(X2Z260BF0Z\Field3[local0])
        X2Z260BF0Z\Field3[local0] = $00
    Next
    For local0 = $00 To $07 Step $01
        If (X2Z260BF0Z\Field4[local0] <> $00) Then
            freeimage(X2Z260BF0Z\Field4[local0])
            X2Z260BF0Z\Field4[local0] = $00
        EndIf
    Next
    For local0 = $00 To $03 Step $01
        X2Z260BF0Z\Field0[local0] = $00
    Next
    For local0 = $00 To $0C Step $01
        If (X2Z260BF0Z\Field1[local0] <> $00) Then
            freeentity(X2Z260BF0Z\Field1[local0])
            X2Z260BF0Z\Field1[local0] = $00
        EndIf
    Next
    Delete X2Z260BF0Z
    X2Z260BF0Z = Null
    Return $00
End Function
