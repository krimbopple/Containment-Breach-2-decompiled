Function GUESSEDsetmatrix%(arg0%, arg1#)
    If (((TXBF2840D48 = $00) Lor (opt\Field70 = $00)) <> 0) Then
        Return $00
    EndIf
    effectfloat(TXBF2840D48, "Strength", arg1, $00)
    effectmatrix(TXBF2840D48, "InvViewProj", cameramatrix(arg0, $03, TX20ZZFFX0Z), $00)
    effectfloat(TXBF2840D48, "Timestep", (MP_GetLoadingProgress() / 70.0), $00)
    entitytexture(TX02ZXFF4BF, T20Z2020X22, $00, $01)
    GUESSEDhideentity_7(TXBF2840D48, X8DZ8X06XF, "Main", $00)
    GUESSEDhideentity_4(X8DZ8X06XF, texturebuffer(T22FB2Z0B2, $00), $00, $00, $00)
    effectmatrix(TXBF2840D48, "PrevViewProj", cameramatrix(arg0, $02, TX20ZZFFX0Z), $00)
    Return $00
End Function
