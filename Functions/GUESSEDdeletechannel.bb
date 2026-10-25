Function GUESSEDdeletechannel%(arg0.TX2BF6X0FF4, arg1%, arg2%)
    If (arg0\Field10\Field2[arg1] <> arg2) Then
        If (arg0\Field10\Field6[arg1] <> $00) Then
            BASS_ChannelRemoveFX(arg0\Field10\Field7[arg1], arg0\Field10\Field6[arg1])
            arg0\Field10\Field6[arg1] = $00
        EndIf
        If (arg2 <> $FFFFFFFF) Then
            arg0\Field10\Field6[arg1] = BASS_ChannelSetFX(arg0\Field10\Field7[arg1], arg2, $00)
        EndIf
        arg0\Field10\Field2[arg1] = arg2
    EndIf
    Return arg0\Field10\Field6[arg1]
    Return $00
End Function
