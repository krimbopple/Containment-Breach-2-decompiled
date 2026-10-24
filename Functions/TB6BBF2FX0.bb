Function TB6BBF2FX0%(arg0%, arg1%, arg2%, arg3%, arg4%, arg5%, arg6%)
    Local local0$
    Local local1%
    If (((texturewidth(arg1) <> texturewidth(arg2)) Lor (textureheight(arg1) <> textureheight(arg2))) <> 0) Then
        Return $00
    EndIf
    effectvector(Y08D62XFDD, "CameraPosition", entityx(arg0, $01, 1.0), entityy(arg0, $01, 1.0), entityz(arg0, $01, 1.0), 0.0, $00)
    effectfloat(Y08D62XFDD, "FarClip", getcamerarangefar(arg0), $00)
    effectvector(Y08D62XFDD, "LowResTexelSize", (1.0 / (Float texturewidth(arg1))), (1.0 / (Float textureheight(arg1))), 0.0, 0.0, $00)
    effectmatrix(Y08D62XFDD, "InvViewProj", cameramatrix(arg0, $03, TX20ZZFFX0Z), $00)
    local0 = "Final"
    If (texturewidth(arg3) <> texturewidth(ABBZX2DF)) Then
        XBBD0606BZ(Y08D62XFDD, arg3, "Bilateral", $00)
        XBBD0606BZ(Y08D62XFDD, arg4, "Normal", $00)
    Else
        local0 = "FinalSimple"
    EndIf
    entitytexture(TX02ZXFF4BF, TDB84FBX46, $00, $01)
    entitytexture(TX02ZXFF4BF, ABBZX2DF, $00, $02)
    entitytexture(TX02ZXFF4BF, arg3, $00, $03)
    entitytexture(TX02ZXFF4BF, arg4, $00, $04)
    For local1 = $01 To $01 Step $01
        entitytexture(TX02ZXFF4BF, arg1, $00, $00)
        effectvector(Y08D62XFDD, "BlurInvSize", (1.0 / (Float texturewidth(arg1))), 0.0, 0.0, 0.0, $00)
        XBBD0606BZ(Y08D62XFDD, arg2, "Blur", $00)
        entitytexture(TX02ZXFF4BF, arg2, $00, $00)
        effectvector(Y08D62XFDD, "BlurInvSize", 0.0, (1.0 / (Float textureheight(arg2))), 0.0, 0.0, $00)
        XBBD0606BZ(Y08D62XFDD, arg1, "Blur", $00)
    Next
    entitytexture(TX02ZXFF4BF, arg1, $00, $00)
    XBBD0606BZ(Y08D62XFDD, arg5, local0, arg6)
    entitytexture(TX02ZXFF4BF, T22FB2Z0B2, $00, $00)
    Return $00
End Function
