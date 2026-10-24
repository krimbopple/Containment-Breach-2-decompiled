Function XBBD0606BZ%(arg0%, arg1%, arg2$, arg3%)
    T206F66BZZ8(arg0)
    showentity(TX02ZXFF4BF)
    entityblend(TX02ZXFF4BF, arg3)
    setbuffer(texturebuffer(arg1, $00), XB0080D6B2(), $00)
    effecttechnique(arg0, arg2)
    cameraviewport(XFXFXB6F68, $00, $00, texturewidth(arg1), textureheight(arg1))
    renderentity(XFXFXB6F68, TX02ZXFF4BF, NAN)
    hideentity(TX02ZXFF4BF)
    Return $00
End Function
