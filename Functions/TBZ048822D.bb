Function TBZ048822D%()
    Local local0%
    Local local1#
    Local local2#
    Local local3#
    local0 = $00
    local1 = 0.9
    While (0.3 <= local1)
        local2 = ((Float opt\Field21) - ((Float imagewidth(mma\Field4)) * local1))
        local3 = ((Float (opt\Field46 - imageheight(mma\Field0))) - (20.0 * menuscale))
        If ((mouseon((Int local2), (Int local3), imagewidth(mma\Field0), imageheight(mma\Field0)) And TDD0Z6BXB6\Field7) <> 0) Then
            Select local0
                Case $00
                    execfile("https://discord.gg/yz32AQcCzw")
                Case $01
                    execfile("https://boosty.to/euclidlabs")
                Case $02
                    execfile("https://www.youtube.com/@Euclid-Labs")
                Case $03
                    execfile("https://scpcbultimatereborn.miraheze.org/wiki/Main_Page")
            End Select
            TDD0Z6BXB6\Field7 = $00
        EndIf
        local0 = (local0 + $01)
        local1 = (local1 + -0.2)
    Wend
    Return $00
End Function
