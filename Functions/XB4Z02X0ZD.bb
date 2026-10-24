Function XB4Z02X0ZD%(arg0%)
    Local local0%
    Local local1.F4X4XZ2BZ
    Local local2$
    Local local3.TBZZ66Z8FZ
    If (ZXZFD24XF <> arg0) Then
        local0 = (ZXZFD24XF Xor arg0)
        ZXZFD24XF = arg0
        For local1 = Each F4X4XZ2BZ
            If (local1\Field1 <> $00) Then
                If ((local1\Field0 And local0) <> $00) Then
                    local2 = ""
                    For local3 = Each TBZZ66Z8FZ
                        If ((((local3\Field0 And local1\Field0) <> $00) And ((local3\Field0 And ZXZFD24XF) = $00)) <> 0) Then
                            local2 = ((local2 + local3\Field1) + " ")
                        EndIf
                    Next
                    reloadeffect(local1\Field1, "GFX\Shaders\Deferred\Input.fx", (local2 + "REVERSEDZ"))
                EndIf
            EndIf
        Next
        TF6DBD6646()
    EndIf
    Return $00
End Function
