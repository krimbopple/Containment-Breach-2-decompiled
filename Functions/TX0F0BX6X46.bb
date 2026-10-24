Function TX0F0BX6X46%(arg0%, arg1#, arg2#, arg3#, arg4%, arg5%)
    Local local0.F4X4XZ2BZ
    Local local1%
    Local local2.A262400ZZ
    TX20ZZFFX0Z = arg1
    If (XF66828X2X($00) <> $00) Then
        If (arg5 = $00) Then
            arg5 = backbuffer()
        EndIf
        currtrisamount = $00
        X4D6XF2442 = $00
        For local0 = Each F4X4XZ2BZ
            If (local0\Field1 <> $00) Then
                effecttechnique(local0\Field1, "Deferred")
            EndIf
        Next
        TXB06B40802(arg2, arg3, opt\Field17)
        cameraviewport(arg0, $00, $00, texturewidth(T22FB2Z0B2), textureheight(T22FB2Z0B2))
        If (fog <> Null) Then
            X602XX6ZF6(texturebuffer(T22FB2Z0B2, $00), (Int fog\Field8), (Int fog\Field15), (Int fog\Field5), $FF)
        Else
            X602XX6ZF6(texturebuffer(T22FB2Z0B2, $00), $00, $00, $00, $00)
        EndIf
        X602XX6ZF6(texturebuffer(TXZDB46B02X, $00), $00, $00, $00, $FF)
        X602XX6ZF6(texturebuffer(TDB84FBX46, $00), $00, $00, $00, $00)
        X602XX6ZF6(texturebuffer(T20Z2020X22, $00), $00, $00, $00, $00)
        X602XX6ZF6(texturebuffer(X2BFB86264, $00), $00, $00, $00, $00)
        X602XX6ZF6(texturebuffer(XFB40886X8, $00), $00, $00, $00, $FF)
        X602XX6ZF6(texturebuffer(X8DZ8X06XF, $00), $00, $00, $00, $00)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), XB0080D6B2(), $00)
        setbuffer(texturebuffer(TXZDB46B02X, $00), XB0080D6B2(), $01)
        setbuffer(texturebuffer(TDB84FBX46, $00), XB0080D6B2(), $02)
        setbuffer(texturebuffer(T20Z2020X22, $00), XB0080D6B2(), $03)
        cameraclsmode(arg0, $00, $01)
        If (fog <> Null) Then
            ambientlight(fog\Field9, fog\Field16, fog\Field7)
        Else
            ambientlight(127.0, 127.0, 127.0)
        EndIf
        wireframe(wireframestate)
        Y004BZ0X84()
        renderworld(TX20ZZFFX0Z, arg0)
        T86XBX88XD()
        cameraclsmode(arg0, $00, $00)
        If (arg4 = $00) Then
            FZ486D2BB(arg0)
        EndIf
        cameraclsmode(arg0, $00, $01)
        TDFDZ8F28(arg0)
        local1 = cameramatrix(arg0, $03, TX20ZZFFX0Z)
        For local2 = Each A262400ZZ
            effectmatrix(local2\Field1, "InvViewProj", local1, $00)
        Next
        effectmatrix(TXF460XZDBD, "InvViewProj", local1, $00)
        wireframe($00)
        X480X0D228(arg0, arg4)
        cameraclsmode(arg0, $00, $00)
        For local0 = Each F4X4XZ2BZ
            If (local0\Field1 <> $00) Then
                effecttechnique(local0\Field1, "Deferred")
            EndIf
        Next
        If (((fog <> Null) And (arg4 = $00)) <> 0) Then
            XX46D20XB2((Int fog\Field8), (Int fog\Field15), (Int fog\Field5))
        EndIf
        DD6Z2686Z(arg0, 1.0, 1.9, 0.047)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), XB0080D6B2(), $00)
        cameraclsmode(arg0, $00, $00)
        wireframe(wireframestate)
        renderworld(TX20ZZFFX0Z, arg0)
        T86XBX88XD()
        cameraclsmode(arg0, $01, $01)
        wireframe($00)
        If (arg4 = $00) Then
            If (opt\Field71 <> 0) Then
                TB6BBF2FX0(arg0, XFB40886X8, X8DZ8X06XF, ABBZX2DF, TDB84FBX46, T22FB2Z0B2, $03)
            EndIf
            TZD06B2ZF8(arg0)
            X408D4XBB2(arg0, 1.0)
            DB62X6XDB(arg0)
            TX206D22D80(T22FB2Z0B2, texturebuffer(TXZDB46B02X, $00), XB0080D6B2(), ($02 - ((textureflags(T22FB2Z0B2) And $1000) <> $00)), $00)
            If (TX82X82FB84(TXZDB46B02X, arg5) = $00) Then
                TX206D22D80(TXZDB46B02X, arg5, $00, $00, $00)
            EndIf
        Else
            TX206D22D80(T22FB2Z0B2, texturebuffer(TXZDB46B02X, $00), XB0080D6B2(), $01, $00)
        EndIf
        setbuffer(backbuffer(), $00, $00)
    Else
        renderworld(TX20ZZFFX0Z, $00)
        T86XBX88XD()
    EndIf
    Return $00
End Function
