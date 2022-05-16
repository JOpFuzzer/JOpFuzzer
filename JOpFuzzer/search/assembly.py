class Assembly:

    def __init__(self, coarse, fine):
        self.res = 1
        self.coarse = coarse
        self.fine = fine
        self.signature = ""
        self.level = ""
        self.metadata = []
        self.opcodes = []
        self.cut_coarse()
        self.cut_fine()

    def cut_coarse(self):
        data = self.coarse.split("\n")
        for i in range(len(data)):
            if "Compiled method" in data[i]:
                if "c1" in data[i]:
                    self.level = "c1"
                else:
                    self.level = "c2"
            elif "total in heap" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "relocation" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "main code " in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "stub code" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "oops" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "metadata" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "scopes data" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "scopes pcs" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "dependencies" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "nul chk table" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "dependencies" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])
            elif "handler table" in data[i]:
                index = data[i].rindex(" ")
                self.metadata.append(data[i][index + 1:])

    def cut_fine(self):
        data = self.fine.split("\n")
        items = data[0].split("\'")
        self.signature = items[5] + "." + items[1] + items[3]
        for i in range(1, len(data)):
            if data[i].startswith("  0x"):
                start = data[i].find(":")
                if start == -1:
                    continue
                asm = data[i][start + 1:].strip()
                asm = asm.split(" ")
                if asm[0] != "hlt" and not asm[0].startswith("0x"):
                    self.opcodes.append(asm[0])
