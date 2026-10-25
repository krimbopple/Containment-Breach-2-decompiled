Function GUESSEDrendertex%(arg0%, arg1#, arg2#, arg3#, arg4%, arg5%)
    Local local0.F4X4XZ2BZ
    Local local1%
    Local local2.A262400ZZ
    TX20ZZFFX0Z = arg1
    If (GUESSEDinputfx($00) <> $00) Then
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
        GUESSEDcreateentity_5(arg2, arg3, opt\Field17)
        cameraviewport(arg0, $00, $00, texturewidth(T22FB2Z0B2), textureheight(T22FB2Z0B2))
        If (fog <> Null) Then
            GUESSEDsetcls(texturebuffer(T22FB2Z0B2, $00), (Int fog\Field8), (Int fog\Field15), (Int fog\Field5), $FF)
        Else
            GUESSEDsetcls(texturebuffer(T22FB2Z0B2, $00), $00, $00, $00, $00)
        EndIf
        GUESSEDsetcls(texturebuffer(TXZDB46B02X, $00), $00, $00, $00, $FF)
        GUESSEDsetcls(texturebuffer(TDB84FBX46, $00), $00, $00, $00, $00)
        GUESSEDsetcls(texturebuffer(T20Z2020X22, $00), $00, $00, $00, $00)
        GUESSEDsetcls(texturebuffer(X2BFB86264, $00), $00, $00, $00, $00)
        GUESSEDsetcls(texturebuffer(XFB40886X8, $00), $00, $00, $00, $FF)
        GUESSEDsetcls(texturebuffer(X8DZ8X06XF, $00), $00, $00, $00, $00)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00)
        setbuffer(texturebuffer(TXZDB46B02X, $00), GUESSEDtexfunc(), $01)
        setbuffer(texturebuffer(TDB84FBX46, $00), GUESSEDtexfunc(), $02)
        setbuffer(texturebuffer(T20Z2020X22, $00), GUESSEDtexfunc(), $03)
        cameraclsmode(arg0, $00, $01)
        If (fog <> Null) Then
            ambientlight(fog\Field9, fog\Field16, fog\Field7)
        Else
            ambientlight(127.0, 127.0, 127.0)
        EndIf
        wireframe(wireframestate)
        GUESSEDhideentity_8()
        renderworld(TX20ZZFFX0Z, arg0)
        GUESSEDrenderbatches()
        cameraclsmode(arg0, $00, $00)
        If (arg4 = $00) Then
            GUESSEDrenderentity(arg0)
        EndIf
        cameraclsmode(arg0, $00, $01)
        GUESSEDgetentity_6(arg0)
        local1 = cameramatrix(arg0, $03, TX20ZZFFX0Z)
        For local2 = Each A262400ZZ
            effectmatrix(local2\Field1, "InvViewProj", local1, $00)
        Next
        effectmatrix(TXF460XZDBD, "InvViewProj", local1, $00)
        wireframe($00)
        GUESSEDgetentity_8(arg0, arg4)
        cameraclsmode(arg0, $00, $00)
        For local0 = Each F4X4XZ2BZ
            If (local0\Field1 <> $00) Then
                effecttechnique(local0\Field1, "Deferred")
            EndIf
        Next
        If (((fog <> Null) And (arg4 = $00)) <> 0) Then
            GUESSEDtexfunc_2((Int fog\Field8), (Int fog\Field15), (Int fog\Field5))
        EndIf
        GUESSEDsetsize(arg0, 1.0, 1.9, 0.047)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00)
        cameraclsmode(arg0, $00, $00)
        wireframe(wireframestate)
        renderworld(TX20ZZFFX0Z, arg0)
        GUESSEDrenderbatches()
        cameraclsmode(arg0, $01, $01)
        wireframe($00)
        If (arg4 = $00) Then
            If (opt\Field71 <> 0) Then
                GUESSEDgetentity_5(arg0, XFB40886X8, X8DZ8X06XF, ABBZX2DF, TDB84FBX46, T22FB2Z0B2, $03)
            EndIf
            GUESSEDrendercamera(arg0)
            GUESSEDsetmatrix(arg0, 1.0)
            GUESSEDgetcamera(arg0)
            GUESSEDhideentity_4(T22FB2Z0B2, texturebuffer(TXZDB46B02X, $00), GUESSEDtexfunc(), ($02 - ((textureflags(T22FB2Z0B2) And $1000) <> $00)), $00)
            If (GUESSEDsetentity_8(TXZDB46B02X, arg5) = $00) Then
                GUESSEDhideentity_4(TXZDB46B02X, arg5, $00, $00, $00)
            EndIf
        Else
            GUESSEDhideentity_4(T22FB2Z0B2, texturebuffer(TXZDB46B02X, $00), GUESSEDtexfunc(), $01, $00)
        EndIf
        setbuffer(backbuffer(), $00, $00)
    Else
        renderworld(TX20ZZFFX0Z, $00)
        GUESSEDrenderbatches()
    EndIf
    Return $00
End Function
