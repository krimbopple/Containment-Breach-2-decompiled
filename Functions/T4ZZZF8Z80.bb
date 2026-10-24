Function T4ZZZF8Z80%(arg0.TF2ZXX8FZ, arg1%, arg2%)
    Local local0#
    If (arg0\Field6 = $00) Then
        ChannelVolume(arg0\Field8, ((arg0\Field5 * opt\Field13) * opt\Field2))
        If ((arg1 And (ChannelPlaying(arg0\Field8) = $00)) <> 0) Then
            TXX62BF2DX(arg0)
        EndIf
    Else
        local0 = arg0\Field5
        If (TXXF6F02DB2[arg0\Field7] <> Null) Then
            positionentity(arg0\Field6, TXXF6F02DB2[arg0\Field7]\Field19, TXXF6F02DB2[arg0\Field7]\Field49, TXXF6F02DB2[arg0\Field7]\Field26, $00)
            If (arg0\Field2 <> 0) Then
                local0 = (TXXF6F02DB2[arg0\Field7]\Field22 * local0)
            EndIf
        EndIf
        updatesoundorigin(arg0\Field8, camera, arg0\Field6, arg0\Field9, local0, arg0\Field4, $01, arg2)
        If ((arg1 And ((ChannelPlaying(arg0\Field8) = $00) Lor ((TXXF6F02DB2[arg0\Field7] <> Null) And entityhidden(TXXF6F02DB2[arg0\Field7]\Field52)))) <> 0) Then
            TXX62BF2DX(arg0)
        EndIf
    EndIf
    Return $00
End Function
