Function GUESSEDrenderbuffer%(arg0%, arg1%, arg2%, arg3%)
    Local local0.F4X4XZ2BZ
    If (T42DZ064FB\Field6 <> Null) Then
        positionentity(T42DZ064FB\Field6\Field3, 10.0, (T42DZ064FB\Field6\Field0 + 10.0), 12.0, $00)
        scaleentity(T42DZ064FB\Field6\Field3, T42DZ064FB\Field6\Field4, T42DZ064FB\Field6\Field4, T42DZ064FB\Field6\Field4, $00)
        cameraviewport(T42DZ064FB\Field8, arg0, arg1, arg2, arg3)
        setbuffer(depthbuffer(), $00, $00)
        clscolor($FF, $00, $00, $FF)
        cls()
        clscolor($00, $00, $00, $FF)
        setbuffer(backbuffer(), $00, $00)
        cameraclsmode(T42DZ064FB\Field8, $00, $00)
        camerazoom(T42DZ064FB\Field8, (T42DZ064FB\Field11 + 1.5))
        ambientlight(60.0, 60.0, 60.0)
        For local0 = Each F4X4XZ2BZ
            If ((local0\Field0 And $1000) <> 0) Then
                effecttechnique(local0\Field1, "Deferred")
                effectvector(local0\Field1, "LightColor", 1.0, 1.0, 1.0, 0.0, $00)
                effectvector(local0\Field1, "LightDirection", sin(160.0), tan(-45.0), cos(160.0), 0.0, $00)
            EndIf
        Next
        renderentity(T42DZ064FB\Field8, max(0.0, ((fps\Field7 / 1.147541) + 1.0)), NAN)
    EndIf
    Return $00
End Function
