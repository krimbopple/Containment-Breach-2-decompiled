Function GUESSEDgetentity_8%(arg0%, arg1%)
    Local local0.F4X4XZ2BZ
    Local local1%
    Local local2%
    Local local3.lights
    Local local4.TX64X4ZXXX0
    Local local5#
    Local local6#
    Local local7#
    Local local8#
    Local local9#
    Local local10.X4X6Z4D6F2
    local2 = (arg1 Lor (opt\Field76 > $01))
    For local0 = Each F4X4XZ2BZ
        If (local0\Field1 <> $00) Then
            effecttechnique(local0\Field1, "ShadowMap")
        EndIf
    Next
    cameraclsmode(arg0, $00, $00)
    local5 = getcamerarangenear(arg0)
    local6 = getcamerarangefar(arg0)
    showentity(XBFB62Z0F0)
    showentity(TX6D2F2B600)
    showentity(TX228822BX8)
    showentity(T204DXXFX02)
    beginrender(TX20ZZFFX0Z, $14)
    For local3 = Each lights
        If (entityhidden(local3\Field7) = $00) Then
            GUESSEDpositionentity_4(arg0, local3\Field7, (local3\Field4 * 10.0), local3\Field19, (Int local3\Field20), (Int local3\Field3), (Int local3\Field18), max((local3\Field12 * min(secondarylighton, 1.0)), (Float arg1)), local3\Field5, local3\Field0, (local3\Field6 And local2), (local3\Field17 * 0.1))
        EndIf
    Next
    For local4 = Each TX64X4ZXXX0
        If (((entityhidden(local4\Field7) = $00) And ((getparent(local4\Field7) = $00) Lor (entityhidden(getparent(local4\Field7)) = $00))) <> 0) Then
            GUESSEDpositionentity_4(arg0, local4\Field7, local4\Field1, local4\Field0, local4\Field5, local4\Field8, local4\Field4, local4\Field2, local4\Field9, local4\Field3, (local4\Field10 And local2), (local4\Field6 * 0.1))
        EndIf
    Next
    If ((((T8660BZ460 <> Null) And ((T8660BZ460\Field2 > $00) Lor (T8660BZ460\Field8 = $03))) And (T8660BZ460\Field8 > $00)) <> 0) Then
        GUESSEDpositionentity_4(arg0, blitz_TB8D046D4X0(entityx(arg0, $01, TX20ZZFFX0Z), entityy(arg0, $01, TX20ZZFFX0Z), entityz(arg0, $01, TX20ZZFFX0Z)), (1.0 / 0.1024), 0.0, $C8, $C8, $C8, 2.5, $02, 90.0, $00, 0.0)
    EndIf
    endrender()
    GUESSEDhideentity_4(X2BFB86264, texturebuffer(T22FB2Z0B2, $00), GUESSEDtexfunc(), $00, $03)
    If (((fog <> Null) And opt\Field6) <> 0) Then
        GUESSEDsetbuffer(X8DZ8X06XF)
        local7 = fog\Field9
        local8 = fog\Field16
        local9 = fog\Field7
        For local10 = Each X4X6Z4D6F2
            GUESSEDscaleentity_3(arg0, (Int ((local7 / (Float local10\Field2\Field11)) * 255.0)), (Int ((local8 / (Float local10\Field2\Field8)) * 255.0)), (Int ((local9 / (Float local10\Field2\Field4)) * 255.0)), local10\Field2\Field9, local10\Field0, local10\Field1)
        Next
    EndIf
    cameraclsmode(arg0, $00, $00)
    camerarange(arg0, local5, local6)
    hideentity(XBFB62Z0F0)
    hideentity(TX6D2F2B600)
    hideentity(TX228822BX8)
    hideentity(T204DXXFX02)
    If (TX4XBZ22ZF4 < millisecs()) Then
        TX4XBZ22ZF4 = (millisecs() + $00)
    EndIf
    If (opt\Field6 <> 0) Then
        GUESSEDsettex_3(X8DZ8X06XF)
    EndIf
    Return $00
End Function
