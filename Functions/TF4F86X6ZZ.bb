Function TF4F86X6ZZ.T20BFZFZ62X(arg0#, arg1#, arg2#, arg3#, arg4%, arg5%, arg6.TX2BF6X0FF4, arg7%, arg8%, arg9%)
    Local local0.X44ZF6442X
    Local local1%
    Local local2.T20BFZFZ62X
    Local local3%
    Local local4%
    Local local5%
    Local local6.items
    If (arg4 = $00) Then
        Return Null
    EndIf
    local0 = T60880B62X(arg4)
    If (local0 = Null) Then
        Return Null
    EndIf
    local2 = (New T20BFZFZ62X)
    X0FBD6D40(local2, arg0, arg1, arg2, arg3, arg4, arg5)
    local2\Field5 = $12C
    local2\Field0 = (T2FFB8B2F0() + (local2\Field5 * $3E8))
    If (arg8 = $FFFFFFFF) Then
        local3 = $FFFFFFFF
        For local1 = $00 To $07 Step $01
            If (local0\Field22[local1] <> $00) Then
                local3 = local1
            EndIf
        Next
        If (local3 >= $00) Then
            arg8 = rand($00, local3)
        EndIf
    EndIf
    If (((arg8 >= $00) And (arg8 < $08)) <> 0) Then
        local4 = local0\Field22[arg8]
        local5 = extractanimseq(local2\Field19, TFDFXFF244(local4), XZZF4F4DZ0(local4), $00, "")
        If (arg7 <> 0) Then
            animate(local2\Field19, $03, 200.0, local5, 0.0)
        Else
            animate(local2\Field19, $03, local0\Field26[arg8], local5, 0.0)
        EndIf
        local2\Field13 = arg8
    EndIf
    If (arg6 <> Null) Then
        local2\Field17 = arg6\Field13
        For local1 = $00 To $09 Step $01
            Y04D8ZZXXF(local2, local1, arg6\Field55\Field3[local1]\Field3)
        Next
        If ((TXB2BFFFFFX() And (selecteddifficulty\Field10 <> $00)) <> 0) Then
            local2\Field11 = $00
            For local6 = Each items
                If (((local6\Field29 = arg6\Field13) And (local6\Field18 = $00)) <> 0) Then
                    If (((local2\Field11 = $0A) Lor (selecteddifficulty\Field10 = $02)) <> 0) Then
                        removeitem(local6, $01)
                    Else
                        local6\Field29 = $00
                        local6\Field17 = $01
                        local2\Field12[local2\Field11] = local6
                        local2\Field11 = (local2\Field11 + $01)
                    EndIf
                EndIf
            Next
        EndIf
    EndIf
    BXXZZ0426(local2, arg9)
    Return local2
    Return Null
End Function
