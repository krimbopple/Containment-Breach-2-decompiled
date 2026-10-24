Function removetextureinstances%()
    Local local0%
    Local local1%
    Local local2%
    local1 = TD4644B68Z(TX0Z2Z4F86D(achievementsarray, "achievements"))
    local2 = TD0DFDZ4XX(local1)
    For local0 = $00 To (local2 - $01) Step $01
        freeimage(XF2FX4F0X2(achievementsimages, TX240XXB6Z6(TX0Z2Z4F86D(D8XX4X0D0(local1, local0), "id"))))
    Next
    freeimage(XF2FX4F0X2(achievementsimages, "locked"))
    X2B80X0XBB(achievementsindex)
    achievementsindex = $00
    X2B80X0XBB(achievementsimages)
    achievementsimages = $00
    X2B80X0XBB(unlockedachievements)
    unlockedachievements = $00
    If (achievementsarray <> $00) Then
        Y00DFZDDF6(achievementsarray)
    EndIf
    If (localachievementsarray <> $00) Then
        Y00DFZDDF6(localachievementsarray)
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
