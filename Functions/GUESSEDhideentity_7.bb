Function GUESSEDhideentity_7%(arg0%, arg1%, arg2$, arg3%)
    GUESSEDcallentityeffect(arg0)
    showentity(TX02ZXFF4BF)
    entityblend(TX02ZXFF4BF, arg3)
    setbuffer(texturebuffer(arg1, $00), GUESSEDtexfunc(), $00)
    effecttechnique(arg0, arg2)
    cameraviewport(XFXFXB6F68, $00, $00, texturewidth(arg1), textureheight(arg1))
    renderentity(XFXFXB6F68, TX02ZXFF4BF, NAN)
    hideentity(TX02ZXFF4BF)
    Return $00
End Function
