Function GUESSEDhideentity_4%(arg0%, arg1%, arg2%, arg3%, arg4%)
    Local local0%
    local0 = graphicsbuffer()
    entityblend(TX02ZXFF4BF, arg4)
    GUESSEDcallentityeffect(TX2Z2D0X2)
    entitytexture(TX02ZXFF4BF, arg0, $00, $00)
    If (arg3 = $01) Then
        effecttechnique(TX2Z2D0X2, "ACES")
    ElseIf (arg3 = $02) Then
        effecttechnique(TX2Z2D0X2, "Pow")
    Else
        effecttechnique(TX2Z2D0X2, "Main")
    EndIf
    showentity(TX02ZXFF4BF)
    setbuffer(arg1, arg2, $00)
    cameraviewport(XFXFXB6F68, $00, $00, bufferwidth(arg1), bufferheight(arg1))
    renderentity(XFXFXB6F68, TX02ZXFF4BF, NAN)
    hideentity(TX02ZXFF4BF)
    entitytexture(TX02ZXFF4BF, T22FB2Z0B2, $00, $00)
    setbuffer(local0, GUESSEDtexfunc(), $00)
    Return $00
End Function
