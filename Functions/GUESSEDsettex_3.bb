Function GUESSEDsettex_3%(arg0%)
    entitytexture(TX02ZXFF4BF, arg0, $00, $00)
    GUESSEDhideentity_7(Y04X2Z0F6F, T22FB2Z0B2, "Main", $03)
    entitytexture(TX02ZXFF4BF, T22FB2Z0B2, $00, $00)
    setbuffer(texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00)
    Return $00
End Function
