# GUI Struktur Data 📊

[![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)](https://www.oracle.com/java/)
[![JavaFX](https://img.shields.io/badge/JavaFX-007396?style=for-the-badge&logo=java&logoColor=white)](https://openjfx.io/)
[![License](https://img.shields.io/badge/License-MIT-green.svg?style=for-the-badge)](LICENSE)

> Aplikasi GUI interaktif untuk mempelajari dan memahami konsep struktur data dengan implementasi praktis menggunakan JavaFX

## 🌟 Fitur Utama

- **🔄 Operasi CRUD Lengkap**: Tambah, Edit, Hapus, dan Tampilkan data
- **💾 Auto-Save XML**: Data otomatis tersimpan setiap kali ada perubahan
- **🔍 Validasi Input**: Validasi real-time untuk mencegah error
- **📱 GUI Responsif**: Interface yang user-friendly dan mudah digunakan
- **📁 Import/Export**: Kemampuan untuk menyimpan dan memuat data dari file XML
- **🎯 Error Handling**: Penanganan error yang komprehensif

## 🚀 Struktur Data yang Diimplementasikan

### 1. ArrayList Implementation
- ✅ Dynamic array operations
- ✅ Index-based insertion
- ✅ Search and remove operations
- ✅ Data persistence dengan XML

### 2. Future Implementations (Coming Soon)
- 📋 Stack 
- 🔄 Queue
- 🌳 Binary Tree
- 📊 Graph
- 🔗 Linked List

## 🛠️ Teknologi yang Digunakan

- **Java 9** - Bahasa pemrograman utama
- **JavaFX** - Framework untuk GUI
- **FXML** - Markup language untuk layout
- **DOM Parser** - Untuk operasi XML
- **CSS** - Styling dan theming

## 📦 Instalasi

### Prerequisites
```bash
# Pastikan Java 11 atau lebih tinggi telah terinstall
java --version

# Pastikan JavaFX telah terinstall atau tersedia
```

### Clone Repository
```bash
git clone https://github.com/yourusername/gui_struktur_data.git
cd gui_struktur_data
```

### Compile dan Run
```bash
# Compile
javac --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml *.java

# Run
java --module-path /path/to/javafx/lib --add-modules javafx.controls,javafx.fxml MainApp
```

## 🎯 Cara Penggunaan

### ArrayList Operations

1. **Menambah Data**
   - Kosongkan field Index untuk menambah di akhir
   - Isi field Index untuk menambah di posisi tertentu
   - Klik tombol "Tambah Data"

2. **Mengedit Data**
   - Isi field Index dengan posisi yang ingin diedit
   - Isi field Value dengan nilai baru
   - Klik tombol "Edit Data"

3. **Menghapus Data**
   - Isi field Index untuk menghapus berdasarkan posisi
   - Atau isi field Value untuk menghapus berdasarkan nilai
   - Klik tombol "Hapus Data"

4. **Clear All Data**
   - Klik tombol "Clear All" untuk menghapus semua data

### Auto-Save Feature
- Data otomatis tersimpan ke file `data_autosave.xml`
- Saat aplikasi dibuka kembali, data akan dimuat otomatis
- Tidak perlu save manual!

## 🎨 Screenshots

### ArrayList Interface
![Screenshot](https://raw.githubusercontent.com/username/repository/GUI_StrukturData/demo/1.png)

## 🔧 Fitur Teknis

### Validation & Error Handling
- ✅ Index validation (prevent out of bounds)
- ✅ Number format validation
- ✅ Empty input handling
- ✅ File I/O error handling

### Performance Features
- ✅ Efficient XML parsing
- ✅ Memory-optimized operations
- ✅ Real-time UI updates

## 📚 Pembelajaran

Project ini dirancang untuk membantu memahami:

1. **Konsep Struktur Data**
   - Bagaimana ArrayList bekerja
   - Operasi insertion, deletion, dan search
   - Time complexity dari setiap operasi

2. **GUI Programming**
   - JavaFX fundamentals
   - Event handling
   - FXML dan controller pattern

3. **File I/O Operations**
   - XML parsing dan generation
   - Data persistence
   - Error handling

## 🤝 Kontribusi

Kontribusi sangat diterima! Silakan:

1. Fork repository ini
2. Buat branch untuk fitur baru (`git checkout -b feature/AmazingFeature`)
3. Commit perubahan (`git commit -m 'Add some AmazingFeature'`)
4. Push ke branch (`git push origin feature/AmazingFeature`)
5. Buat Pull Request

### TODO List
- [ ] Implementasi Stack dengan GUI
- [ ] Implementasi Queue dengan GUI
- [ ] Implementasi Binary Tree visualizer
- [ ] Implementasi Graph visualizer
- [ ] Implementasi Linked List animator
- [ ] Dark mode theme
- [ ] Export ke format JSON
- [ ] Unit testing
- [ ] Performance benchmarking

## 📄 Lisensi

Project ini dilisensikan under MIT License - lihat file [LICENSE](LICENSE) untuk detail.

## 👨‍💻 Author

- **Your Name** - *Initial work* - [YourGitHub](https://github.com/yourusername)

## 🙏 Acknowledgments

- Terima kasih kepada komunitas JavaFX
- Inspirasi dari berbagai tutorial struktur data
- Referensi design pattern dari Oracle JavaFX documentation

---

⭐ **Jangan lupa untuk memberikan star jika project ini membantu Anda!**

📧 **Ada pertanyaan?** Silakan buat issue atau hubungi saya di [email@example.com](mailto:migwaraa@gmail.com)

---

*Dibuat dengan ❤️ untuk pembelajaran struktur data yang lebih interaktif dan menyenangkan!*
