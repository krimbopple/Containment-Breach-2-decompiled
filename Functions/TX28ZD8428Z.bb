Function TX28ZD8428Z%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%)
    If (((arg4 = $00) Lor (arg5 = $00)) <> 0) Then
        Return $00
    EndIf
    positionentity(T204DXXFX02, entityx(arg5, $01, 1.0), entityy(arg5, $01, 1.0), entityz(arg5, $01, 1.0), $00)
    rotateentity(T204DXXFX02, entitypitch(arg5, $01, 1.0), entityyaw(arg5, $01, 1.0), entityroll(arg5, $01, 1.0), $00)
    scaleentity(T204DXXFX02, entityscalex(arg5, $01, 1.0), entityscaley(arg5, $01, 1.0), entityscalez(arg5, $01, 1.0), $00)
    entitytexture(T204DXXFX02, arg4, $00, $03)
    entityeffect(T204DXXFX02, TXF460XZDBD)
    effectvector(TXF460XZDBD, "ProbeColor", ((Float arg1) / 255.0), ((Float arg2) / 255.0), ((Float arg3) / 255.0), 0.0, $00)
    effectvector(TXF460XZDBD, "ProbeDelta", sin((Float arg6)), cos((Float arg6)), 0.0, 0.0, $00)
    effectfloat(TXF460XZDBD, "ProbeMip", (log((Float texturewidth(arg4))) / log(2.0)), $00)
    camerarange(arg0, 0.1, 500000.0)
    renderentity(arg0, T204DXXFX02, NAN)
    Return $00
End Function
