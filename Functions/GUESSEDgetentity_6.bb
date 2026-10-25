Function GUESSEDgetentity_6%(arg0%)
    If ((((TFDDBF2FBF = $00) Lor (opt\Field10 = $00)) And (opt\Field71 = $00)) <> 0) Then
        Return $00
    EndIf
    effectvector(Y08D62XFDD, "CameraPosition", entityx(arg0, $01, 1.0), entityy(arg0, $01, 1.0), entityz(arg0, $01, 1.0), 0.0, $00)
    effectfloat(Y08D62XFDD, "FarClip", getcamerarangefar(arg0), $00)
    effectmatrix(Y08D62XFDD, "InvViewProj", cameramatrix(arg0, $03, TX20ZZFFX0Z), $00)
    entitytexture(TX02ZXFF4BF, TDB84FBX46, $00, $01)
    entitytexture(TX02ZXFF4BF, T20Z2020X22, $00, $02)
    entitytexture(TX02ZXFF4BF, TXZDB46B02X, $00, $03)
    GUESSEDhideentity_7(Y08D62XFDD, ABBZX2DF, "Bilateral", $00)
    Return $00
End Function
