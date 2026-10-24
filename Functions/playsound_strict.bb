Function playsound_strict%(arg0%, arg1%, arg2%)
    Local local0.sound
    Local local1%
    Local local2%
    Local local3#
    local0 = (Object.sound arg0)
    local1 = millisecs()
    If (local0 <> Null) Then
        local3 = (((opt\Field59 * (Float arg1)) + (opt\Field13 * (Float (arg1 = $00)))) * opt\Field2)
        If (arg2 <> 0) Then
            local3 = -1.0
        EndIf
        For local2 = $00 To $0F Step $01
            If (local0\Field2[local2] <> $00) Then
                If (ChannelPlaying(local0\Field2[local2]) = $00) Then
                    If (local0\Field0 = $00) Then
                        If (filetype(local0\Field3) <> $01) Then
                            openconsoleonerror(format(getlocalstring("runerr", "sound.notfound"), local0\Field3, "%s"))
                        ElseIf (opt\Field73 <> 0) Then
                            local0\Field0 = LoadSound(local0\Field3)
                            createsubtitlestoken(local0\Field3, local0)
                        EndIf
                        If (local0\Field0 = $00) Then
                            openconsoleonerror(format(getlocalstring("runerr", "sound.failed.load"), local0\Field3, "%s"))
                        EndIf
                    EndIf
                    local0\Field2[local2] = PlaySound(local0\Field0, local3)
                    local0\Field1 = (local1 + $1388)
                    Return local0\Field2[local2]
                EndIf
            Else
                If (local0\Field0 = $00) Then
                    If (filetype(local0\Field3) <> $01) Then
                        openconsoleonerror(format(getlocalstring("runerr", "sound.notfound"), local0\Field3, "%s"))
                    ElseIf (opt\Field73 <> 0) Then
                        local0\Field0 = LoadSound(local0\Field3)
                        createsubtitlestoken(local0\Field3, local0)
                    EndIf
                    If (local0\Field0 = $00) Then
                        openconsoleonerror(format(getlocalstring("runerr", "sound.failed.load"), local0\Field3, "%s"))
                    EndIf
                EndIf
                local0\Field2[local2] = PlaySound(local0\Field0, local3)
                local0\Field1 = (local1 + $1388)
                Return local0\Field2[local2]
            EndIf
        Next
    EndIf
    Return $00
    Return $00
End Function
