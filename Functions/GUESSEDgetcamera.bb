Function GUESSEDgetcamera%(arg0%)
    Local local0%
    Local local1%
    Local local2%
    Local local3%
    Local local4%
    Local local5%
    Local local6.XZ0FBD6000
    entitytexture(TX02ZXFF4BF, T22FB2Z0B2, $00, $00)
    entitytexture(TX02ZXFF4BF, TXZDB46B02X, $00, $01)
    entitytexture(TX02ZXFF4BF, TDB84FBX46, $00, $02)
    entitytexture(TX02ZXFF4BF, T20Z2020X22, $00, $03)
    local0 = cameramatrix(arg0, $00, TX20ZZFFX0Z)
    local1 = cameramatrix(arg0, $01, TX20ZZFFX0Z)
    local2 = cameramatrix(arg0, $02, TX20ZZFFX0Z)
    local3 = cameramatrix(arg0, $03, TX20ZZFFX0Z)
    local4 = cameramatrix(arg0, $04, TX20ZZFFX0Z)
    local5 = cameramatrix(arg0, $05, TX20ZZFFX0Z)
    camerafogrange(XFXFXB6F68, getcamerafograngenear(arg0), getcamerafograngefar(arg0))
    camerarange(XFXFXB6F68, getcamerarangenear(arg0), getcamerarangefar(arg0))
    For local6 = Each XZ0FBD6000
        If (((local6\Field21 = $06) And (local6\Field3 <> $00)) <> 0) Then
            effectmatrix(local6\Field3, "MAT_VIEW", local0, $01)
            effectmatrix(local6\Field3, "MAT_PROJ", local1, $01)
            effectmatrix(local6\Field3, "MAT_VIEWPROJ", local2, $01)
            effectmatrix(local6\Field3, "MAT_INVVIEWPROJ", local3, $01)
            effectmatrix(local6\Field3, "MAT_INVVIEW", local4, $01)
            effectmatrix(local6\Field3, "MAT_INVPROJ", local5, $01)
            effectvector(local6\Field3, "CAMERA_POSITION", entityx(arg0, $01, 1.0), entityy(arg0, $01, 1.0), entityz(arg0, $01, 1.0), 0.0, $01)
            GUESSEDhideentity_7(local6\Field3, X8DZ8X06XF, local6\Field22, $00)
            GUESSEDhideentity_4(X8DZ8X06XF, texturebuffer(T22FB2Z0B2, $00), $00, $00, $00)
            effectmatrix(local6\Field3, "MAT_PREVVIEWPROJ", local2, $00)
        EndIf
    Next
    Return $00
End Function
