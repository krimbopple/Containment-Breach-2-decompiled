Function YXXFXF8B44%(arg0%, arg1#, arg2#)
    If (((TFDDBF2FBF = $00) Lor (opt\Field10 = $00)) <> 0) Then
        Return $00
    EndIf
    effectfloat(TFDDBF2FBF, "SSAOStrength", arg1, $00)
    effectfloat(TFDDBF2FBF, "SSAORadius", arg2, $00)
    effectmatrix(TFDDBF2FBF, "InvViewProj", cameramatrix(arg0, $03, TX20ZZFFX0Z), $00)
    effectmatrix(TFDDBF2FBF, "InvProj", cameramatrix(arg0, $05, TX20ZZFFX0Z), $00)
    effectmatrix(TFDDBF2FBF, "ViewMat", cameramatrix(arg0, $00, TX20ZZFFX0Z), $00)
    effectvector(TFDDBF2FBF, "CameraPosition", entityx(arg0, $01, 1.0), entityy(arg0, $01, 1.0), entityz(arg0, $01, 1.0), 0.0, $00)
    effectfloat(TFDDBF2FBF, "FarClip", getcamerarangefar(arg0), $00)
    entitytexture(TX02ZXFF4BF, TDB84FBX46, $00, $01)
    entitytexture(TX02ZXFF4BF, T20Z2020X22, $00, $02)
    entitytexture(TX02ZXFF4BF, TXZDB46B02X, $00, $03)
    XBBD0606BZ(TFDDBF2FBF, Y8X620XBX, "SSAO", $00)
    TB6BBF2FX0(arg0, Y8X620XBX, X448F8Z0XB, X48D6Z02F0, XF0XD8XBDD, T22FB2Z0B2, $02)
    Return $00
End Function
