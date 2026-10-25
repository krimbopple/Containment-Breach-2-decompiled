Function GUESSEDrendercamera%(arg0%)
    Local local0.F4X4XZ2BZ
    If (DZ64X028\Field18 <> Null) Then
        cameraclsmode(arg0, $00, $00)
        cameracullmode(arg0, $00)
        For local0 = Each F4X4XZ2BZ
            If (local0\Field1 <> $00) Then
                effecttechnique(local0\Field1, "DepthHack")
                effectfloat(local0\Field1, "DepthMultiply", 100.0, $00)
            EndIf
        Next
        setbuffer(texturebuffer(T20Z2020X22, $00), GUESSEDtexfunc(), $00)
        renderentity(arg0, TX20ZZFFX0Z, NAN)
        setbuffer(texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00)
        cameracullmode(arg0, $01)
        cameraclsmode(arg0, $01, $01)
        For local0 = Each F4X4XZ2BZ
            If (local0\Field1 <> $00) Then
                effecttechnique(local0\Field1, "Deferred")
            EndIf
        Next
    EndIf
    Return $00
End Function
