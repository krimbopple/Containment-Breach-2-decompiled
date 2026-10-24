Function getranddocument$()
    Local local0.itemtemplates
    For local0 = Each itemtemplates
        If (F04ZFD6B2(local0) <> $00) Then
            If (((instr(local0\Field19, "Document SCP-", $01) <> $00) And (rand($1F, $01) = $01)) <> 0) Then
                Return local0\Field19
            EndIf
        EndIf
    Next
    Return "Document SCP-005"
    Return ""
End Function
